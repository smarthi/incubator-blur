package org.apache.blur.store.blockcache_v2;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.UUID;

import org.apache.blur.store.blockcache.LastModified;
import org.apache.blur.store.blockcache_v2.BaseCache.STORE;
import org.apache.blur.store.buffer.BufferStore;
import org.apache.lucene.analysis.core.KeywordAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.IOContext;
import org.apache.lucene.store.IndexInput;
import org.apache.lucene.store.IndexOutput;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.util.Version;
import org.junit.Before;
import org.junit.Test;

public class CacheDirectoryTest {

  private CacheDirectory _cacheDirectory;

  @Before
  public void setup() {
    int totalNumberOfBytes = 1000000;
    int fileBufferSize = 127;
    final int blockSize = 131;
    FileNameBlockSize fileNameBlockSize = new FileNameBlockSize() {
      @Override
      public int getBlockSize(String directoryName, String fileName) {
        return blockSize;
      }
    };
    FileNameFilter writeFilter = new FileNameFilter() {
      @Override
      public boolean accept(String directoryName, String fileName) {
        return true;
      }
    };
    FileNameFilter readFilter = new FileNameFilter() {
      @Override
      public boolean accept(String directoryName, String fileName) {
        return true;
      }
    };
    Cache cache = new BaseCache(totalNumberOfBytes, fileBufferSize, fileNameBlockSize, readFilter, writeFilter,
        STORE.ON_HEAP);
    Directory directory = newDirectory();
    BufferStore.init(128, 128);
    _cacheDirectory = new CacheDirectory("test", directory, cache);
  }

  private Directory newDirectory() {
    return new RDir();
  }

  static class RDir extends RAMDirectory implements LastModified {
    @Override
    public long getFileModified(String name) throws IOException {
      return 0;
    }
  }

  @Test
  public void test1() throws IOException {
    IndexOutput output = _cacheDirectory.createOutput("test.file", IOContext.DEFAULT);
    output.writeLong(0);
    output.writeLong(1);
    output.writeLong(2);
    output.close();

    IndexInput input = _cacheDirectory.openInput("test.file", IOContext.DEFAULT);
    assertEquals(0, input.readLong());
    assertEquals(1, input.readLong());
    assertEquals(2, input.readLong());
    input.close();
  }

  @Test
  public void test2() throws IOException {
    IndexOutput output = _cacheDirectory.createOutput("test.file", IOContext.DEFAULT);
    byte[] buf = new byte[9000];
    for (int i = 0; i < buf.length; i++) {
      buf[i] = (byte) i;
    }
    output.writeBytes(buf, buf.length);
    output.close();

    IndexInput input = _cacheDirectory.openInput("test.file", IOContext.DEFAULT);
    assertEquals(9000, input.length());
    input.close();
  }

  @Test
  public void test3() throws IOException, InterruptedException {
    // Thread.sleep(30000);
    IndexWriterConfig conf = new IndexWriterConfig(Version.LUCENE_43, new KeywordAnalyzer());
    IndexWriter writer = new IndexWriter(_cacheDirectory, conf);
    int docs = 100000;
    for (int i = 0; i < docs; i++) {
      if (i % 500 == 0) {
        System.out.println(i);
      }
      writer.addDocument(newDoc());
      // Thread.sleep(1);
    }
    writer.close();
    System.out.println("done writing");

    DirectoryReader reader = DirectoryReader.open(_cacheDirectory);
    System.out.println("done opening");
    assertEquals(docs, reader.numDocs());

    Document document = reader.document(0);
    System.out.println("done fetching");
    System.out.println(document);

    IndexSearcher searcher = new IndexSearcher(reader);
    TopDocs topDocs = searcher.search(new TermQuery(new Term("test", "test")), 10);
    System.out.println("done searching");
    assertEquals(docs, topDocs.totalHits);

    reader.close();
  }

  private Document newDoc() {
    Document document = new Document();
    document.add(new StringField("test", "test", Store.YES));
    document.add(new TextField("test2", "test", Store.YES));
    document.add(new StringField("id", UUID.randomUUID().toString(), Store.YES));
    return document;
  }

}
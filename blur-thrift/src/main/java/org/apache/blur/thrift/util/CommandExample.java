package org.apache.blur.thrift.util;

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import java.io.IOException;

import org.apache.blur.thirdparty.thrift_0_9_0.TException;
import org.apache.blur.thrift.BlurClientManager;
import org.apache.blur.thrift.Connection;
import org.apache.blur.thrift.generated.Arguments;
import org.apache.blur.thrift.generated.Blur.Client;
import org.apache.blur.thrift.generated.BlurException;
import org.apache.blur.thrift.generated.Value;
import org.apache.blur.thrift.generated.ValueObject;

public class CommandExample {

  public static void main(String[] args) throws BlurException, TException, IOException {
    Client client = BlurClientManager.getClientPool().getClient(new Connection("localhost:40020"));

    Arguments arguments = new Arguments();
    arguments.putToValues("table", new ValueObject(ValueObject._Fields.VALUE, new Value(Value._Fields.STRING_VALUE,
        "test")));
//    arguments.putToValues("shard", new ValueObject(ValueObject._Fields.VALUE, new Value(Value._Fields.STRING_VALUE,
//        "shard-00000000")));

    System.out.println(client.execute("docCountClusterCombine", arguments));
  }
}

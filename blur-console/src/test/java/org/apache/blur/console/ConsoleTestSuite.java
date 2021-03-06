package org.apache.blur.console;

import org.apache.blur.console.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.*;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.io.IOException;

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ConfigTest.class, NodeUtilTest.class, QueryUtilTest.class, TableUtilTest.class})
public class ConsoleTestSuite {
  private static Log log = LogFactory.getLog(ConsoleTestSuite.class);
  
  @ClassRule
  public static ExternalResource testCluster = new ExternalResource() {

    private boolean _managing;

    @Override
    protected void after() {
      if (_managing) {
        try {
          log.warn("SHUTTING DOWN MINI CLUSTER");
          Config.shutdownMiniCluster();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }

    @Override
    protected void before() throws Throwable {
      if (!Config.isClusterSetup()) {
        _managing = true;
        try {
          Config.setupMiniCluster();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }

  };

}

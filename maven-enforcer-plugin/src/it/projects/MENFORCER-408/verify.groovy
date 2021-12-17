/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
File buildLog = new File( basedir, 'build.log' )
// Actually, this assertion is not strictly necessary, because the build should pass anyway.
// But it documents the false failure output which was present before commit @ca40308f.
assert !buildLog.text.contains( """
+-test:dependency-convergence-problem:jar:1.0-SNAPSHOT
  +-org.seleniumhq.selenium:selenium-java:jar:3.0.1:test
    +-org.seleniumhq.selenium:selenium-java:jar:2.53.0:test
""" )

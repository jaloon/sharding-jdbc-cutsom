/*
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

package org.apache.shardingsphere.driver.executor.callback.add;

import org.apache.shardingsphere.infra.executor.sql.execute.engine.driver.jdbc.JDBCExecutionUnit;

import java.sql.Statement;
import java.util.Collection;
import java.util.List;

/**
 * Statement add callback.
 */
// [Custom Modification]: Remove generic type
public interface StatementAddCallback {
    
    /**
     * Add statements and parameter sets.
     *
     * @param statements statements
     * @param parameterSets parameter sets
     */
    // [Custom Modification]: T extends Statement -> JDBCExecutionUnit
    void add(Collection<JDBCExecutionUnit> statements, Collection<List<Object>> parameterSets);
}

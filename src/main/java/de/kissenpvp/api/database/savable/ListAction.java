/*
 *  Copyright 14.07.2022 KissenPvP
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package de.kissenpvp.api.database.savable;

import java.io.Serializable;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface ListAction
{
    void execute(ListExecution listExecution, Object... values);

    enum ListExecution implements Serializable
    {
        SET,
        ADD,
        ADD_INDEX,
        ADD_ALL,
        ADD_ALL_INDEX_INCLUDED,
        REMOVE,
        REMOVE_INDEX,
        REMOVE_ALL,
        REMOVE_RANGE,
        REMOVE_IF,
        RETAIN_ALL,
        REPLACE_ALL,
        REPLACE,
        CLEAR,
        UNDEFINED
    }
}

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

package de.kissenpvp.api.database;

import com.google.gson.JsonElement;
import de.kissenpvp.api.base.Implementation;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Database extends Implementation
{

    /**
     * Turns a {@link Record} to a json.
     *
     * @param record the record instance, with the parameter.
     * @return the json as string.
     */
    String toJson(Record record);

    /**
     * Converts a {@link Record} to a {@link JsonElement} which is provided by the gson api.
     *
     * @param record the record to convert.
     * @return the converted record as {@link JsonElement}
     */
    JsonElement toJsonElement(Record record);

    /**
     * Turns a {@link String} back to a {@link Record}.
     *
     * @param <T>  the type of record, which is wanted.
     * @param json the code previously parsed in {@link #toJson(Record)}
     * @return the record created and with its parameter.
     */
    <T extends Record> T fromJson(String json, Class<T> record);

    <T extends Record> void addRecord(T entry, Meta meta, String id, String key);

    <T extends Record> void removeRecord(T entry, Meta meta, String id, String key);

}

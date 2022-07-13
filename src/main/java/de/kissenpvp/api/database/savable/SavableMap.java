/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the Apache
 * License as published by the Apache Software Foundation,
 * either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the Apache License for more details.
 *
 * You should have received a copy of the Apache License
 * along with this program. If not, see <https://www.apache.org/licenses/LICENSE-2.0>.
 */

package de.kissenpvp.api.database.savable;

import de.kissenpvp.api.database.ObjectMeta;

import java.util.List;
import java.util.Map;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface SavableMap extends Map<String, String>, Cloneable
{
    String getID();

    ObjectMeta getObjectMeta();

    /**
     * This method converts a value and saves the new value in the database.
     *
     * @param key   The key of the values.
     * @param value The value to be set.
     */
    void set(String key, Object value);

    /**
     * This method will set a value in the database only if it isn't there already.
     *
     * @param key   The key of the value.
     * @param value The value that will be set if there is nothing set for the key.
     */
    void setIfAbsent(String key, Object value);

    /**
     * This method removes a value from the database.
     *
     * @param key The key of the object.
     */
    void delete(String key);

    /**
     * This method returns a value from the database. If the value is a list, it will return it in a List.
     *
     * @param key The key of the object.
     * @return The object from the database.
     */
    Object get(String key);

    /**
     * This method returns a value from the database. If the value is a list, it will return it in a List.
     *
     * @param key The key of the object.
     * @return The object from the database.
     */
    <T> T get(String key, Class<T> type);

    /**
     * This method will return a List of Strings from the database.
     *
     * @param key The key of the list.
     * @return The list if there is one.
     */
    DataList getList(String key);

    /**
     * This method will return a List of Strings from the database.
     *
     * @param key The key of the list.
     * @return The list if there is one.
     */
    DataList getListNotNull(String key, boolean store);

    /**
     * Puts a list into the database. (Won't be saved!)
     *
     * @param key   The key of the list.
     * @param value The list that should be saved.
     */
    DataList putList(String key, List<String> value);

    /**
     * Adds a value into the list. (Won't be saved!)
     *
     * @param key   The key of the list.
     * @param value The value you want to add.
     */
    DataList putListValue(String key, String value);

    /**
     * Adds a value into the list. (Won't be saved!)
     *
     * @param key   The key of the list.
     * @param value The value you want to add.
     */
    DataList putListIfAbsent(String key, List<String> value);

    /**
     * Sets a list to a new value. (Will be saved!)
     *
     * @param key   The key of the list.
     * @param value The list.
     */
    DataList setList(String key, List<String> value);

    /**
     * Sets a list to a new value. (Will be saved!)
     *
     * @param key   The key of the list.
     * @param value The list.
     */
    DataList setListIfAbsent(String key, List<String> value);

    /**
     * Adds a value into the list. (Will be saved!)
     *
     * @param key   The key of the list.
     * @param value The value you want to add.
     */
    DataList setListValue(String key, String value);

    /**
     * Removes a list from the database. (Won't be saved!)
     *
     * @param key The key of the list you want to remove.
     */
    void removeList(String key);

    /**
     * Removes a value from the list. (Won't be saved!)
     *
     * @param key   The key of the list.
     * @param value The value you want to remove.
     */
    void removeListValue(String key, String value);

    /**
     * Removes a list from the database. (Will be saved!)
     *
     * @param key The key of the list you want to remove.
     */
    void deleteList(String key);

    /**
     * Removes a value from the list. (Will be saved!)
     *
     * @param key   The key of the list.
     * @param value The value you want to remove.
     */
    void deleteListValue(String key, String value);

    /**
     * Starts a command chain which might save some performance when sending many command at once.
     */
    void chain();

}

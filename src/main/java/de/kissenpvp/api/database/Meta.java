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

package de.kissenpvp.api.database;

import java.util.List;

/**
 * Is an interface between the database and the java plugin.
 *
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Meta
{

    /**
     * Sets a value in a meta.
     *
     * @param totalID The ID, which is located under the IDIdentifier
     * @param key     Under MySQL the column and under files the rear appendage to recognize the value.
     * @param value   The value to be saved.
     * @param plugin  Supports chainMeta
     */
    void setMeta(String totalID, String key, Object value, String... plugin);

    /**
     * This method deletes all data of a specific ID from the database.
     * It should be noted that this data may no longer be stored anywhere and is therefore irrevocably deleted.
     * You should use this method with extreme caution.
     *
     * @param totalID The ID of the entry to delete.
     */
    void delete(String totalID, String... plugin);

    /**
     * Pulls a previously saved meta value from the database and returns it.
     *
     * @param totalID The ID, which is located under the IDIdentifier
     * @param key     Under MySQL the column and under files the rear appendage to recognize the value.
     * @return The value that was found if no value was found, this method will return {@code null}.
     */
    Object getMeta(String totalID, String key);

    /**
     * @param totalID which is located under the IDIdentifier
     * @param key     of the column and under files the rear appendage to recognize the value.
     * @param record  the class of the {@link Record} to get.
     * @param <T>     the type of record to return.
     * @return A list of the given records.
     */
    <T extends Record> List<T> getMetaList(String totalID, String key, Class<T> record);

    /**
     * Pulls a previously saved meta List from the database and returns it.
     *
     * @param totalID which is located under the IDIdentifier
     * @param key     of the column and under files the rear appendage to recognize the value.
     * @return The values that were found if no values were found, this method will return an empty list of Strings.
     */
    List<String> getMetaList(String totalID, String key);

    /**
     * Check if a Meta was stored and is now in the Database.
     *
     * @param totalID The ID, which is located under the IDIdentifier.
     * @param key     Under MySQL the column and under files the rear appendage to recognize the value.
     * @return The value is a boolean, which shows if the given thing exits.
     */
    boolean metaContains(String totalID, String key);

    /**
     * Starts a series of commands to save resources.
     * Only supports normal statements !!No userInputs allowed.
     *
     * @param plugin The plugin that opens a series of commands.
     * @throws UnsupportedOperationException Can only be used with MySQL.
     */
    void initializeBatchSession(String plugin);

    /**
     * Sends the commands in the batch chain to MySQL.
     * Only supports normal statements !!No userInputs allowed.
     *
     * @param plugin The plugin that sends a series of commands.
     * @throws NoSessionException If no session was started or mysql is not in use.
     */
    void stopBatchSession(String plugin) throws NoSessionException;

}

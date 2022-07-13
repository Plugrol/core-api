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

import de.kissenpvp.api.database.savable.Savable;
import de.kissenpvp.api.database.savable.SavableMap;

import java.util.Map;

/**
 * Can store objects using a map to store attributes.
 *
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface ObjectMeta extends Meta
{

    /**
     * Add an object to the meta.
     *
     * @param id   The identifier of the object.
     * @param data This list contains all data that are transferred to the object.
     */
    void add(String id, Map<String, String> data, String... plugin);

    /**
     * Delete an object from the meta.
     *
     * @param totalId The ID of the object.
     */
    void remove(String totalId);

    /**
     * This method returns the data of an object.
     *
     * @param totalId The id of the object.
     * @return The content, that is saved.
     */
    Map<String, String> getData(String totalId);

    /**
     * Reads all the data from a special {@link Savable}, which are objects stored in the database.
     *
     * @param savable the savable to search for.
     * @param <T>     the type of the savable which should be returned.
     * @return a savable map created on this context.
     */
    <T extends Savable> Map<String, SavableMap> getData(Class<T> savable);

    /**
     * Add the data from this map to the database.
     *
     * @param DATA    The data which one should be saved.
     * @param totalId sets the whole data entry to the map.
     */
    void setData(String totalId, Map<String, String> DATA);

}

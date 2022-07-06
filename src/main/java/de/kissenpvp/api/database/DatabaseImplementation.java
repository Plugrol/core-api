/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the GNU General Public
 * License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package de.kissenpvp.api.database;

import de.kissenpvp.api.database.connection.SQLImplementation;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface DatabaseImplementation extends SQLImplementation
{

    /**
     * Turns a {@link Record} to a json.
     *
     * @param record the record instance, with the parameter.
     * @return the json as string.
     */
    String toJson(Record record);

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

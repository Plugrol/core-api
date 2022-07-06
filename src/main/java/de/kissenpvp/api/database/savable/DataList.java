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

package de.kissenpvp.api.database.savable;

import de.kissenpvp.api.database.ObjectMeta;
import de.kissenpvp.api.util.KissenList;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface DataList extends KissenList<String>
{

    /**
     * Turn this list into a record list.
     *
     * @param record type of record this is about.
     * @param <T>    The type of record list to return.
     * @return A list of records.
     */
    <T extends Record> DataRecordList<T> toRecordList(Class<T> record);

    boolean isStore();

    /**
     * @param store Whether the data should be written to the database imminently.
     */
    void setStore(boolean store);

    String getID();

    String getKey();

    ObjectMeta getMeta();

}

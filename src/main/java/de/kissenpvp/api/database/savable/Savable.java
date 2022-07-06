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

import java.util.Map;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Savable
{

    ObjectMeta getDestinationMeta();

    String getSaveID();

    String getRawID();

    default String getID()
    {
        return getSaveID() + getRawID();
    }

    void setup();

    Map<String, Object> getStorage();

    SavableMap getMeta();

}

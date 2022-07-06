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

package de.kissenpvp.api.util;

import de.kissenpvp.api.database.savable.ListAction;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface KissenList<T> extends List<T>
{

    /**
     * Inverts the presents of a value in the list.
     * This means, when it is present, it will be removed and {false, {@link #remove(Object)}} will be returned.
     * When the value isn't present it will be added and {true, {@link #add(Object)}}, will be returned.
     *
     * @param value The value to invert.
     * @return an array of booleans. the first one represent, if the value is present now, or not. The second is the boolean whether the action could be executed.
     */
    boolean[] invert(T value);

    /**
     * Replace values in a list.
     *
     * @param predicate whether the value should be replaced.
     * @param object    the object to replace it with
     * @return whether something has changed.
     */
    int replace(Predicate<T> predicate, T object);

    ListAction getListAction();

    void setListAction(ListAction listAction);

    boolean isAllowDuplicates();

    void setAllowDuplicates(boolean allowDuplicates);

}

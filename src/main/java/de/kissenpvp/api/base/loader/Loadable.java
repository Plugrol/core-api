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

package de.kissenpvp.api.base.loader;

import de.kissenpvp.api.reflection.ReflectionClass;

import java.util.Comparator;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Loadable
{
    /**
     * Indicates whether the given class is loadable.
     *
     * @param clazz  The class associated with it.
     * @param plugin The plugin on which the whole thing is registered.
     * @return Whether it's loadable or not.
     */
    boolean isLoadable(ReflectionClass clazz, Object plugin);

    /**
     * Loads the content of the loadable.
     *
     * @param clazz  The class associated with it.
     * @param plugin The plugin on which the whole thing is registered.
     */
    void load(ReflectionClass clazz, Object plugin);

    /**
     * The object to be added to the list.
     *
     * @param clazz The class associated with it.
     * @return The object that is inserted.
     */
    default Object getInsert(ReflectionClass clazz)
    {
        return clazz.getInstance();
    }

    /**
     * Returns a comparator for sorting the list.
     *
     * @return The comparator used for sorting the list.
     */
    default Comparator<?> getComparator()
    {
        return null;
    }

    /**
     * Starts everything that can only be executed after the server has started.
     *
     * @param clazz  The class associated with it.
     * @param plugin The plugin on which the whole thing is registered.
     */
    void enable(ReflectionClass clazz, Object plugin);
}

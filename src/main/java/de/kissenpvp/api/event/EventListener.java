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

package de.kissenpvp.api.event;


import com.google.common.reflect.TypeToken;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface EventListener<T extends Event>
{

    /**
     * Is triggered, when the class of {@link T} is called.
     * This class is unknown in this class, but is known, when the event is registered.
     *
     * @param event The event, that was called, when this is triggered.
     */
    void call(T event);

    /**
     * The type of the event to specify it's time to be triggered.
     * This method does not provide any information about the event, when it is triggered. Therefor is the variable {@code event} in {@link #call(Event)}.
     *
     * @return The class of the type, this event should be triggered by.
     */
    default String getType()
    {
        return new TypeToken<T>(getClass())
        {
        }.getType().getTypeName();
    }

    /**
     * Calls an event wand casts it to the needed type.
     *
     * @param event the event to call.
     */
    default void callUnknown(Event event)
    {
        call((T) event);
    }

}

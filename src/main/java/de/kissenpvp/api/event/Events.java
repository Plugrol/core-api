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

import de.kissenpvp.api.base.Implementation;

import java.util.List;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Events extends Implementation
{
    /**
     * Returns the events that were registered to the list of the {@link ClassLoader}
     *
     * @return A list of all loaded events which is unmodifiable.
     */
    List<?> getEventListener();


    /**
     * Triggers an {@link Event}.
     * Every {@link EventListener} which has the event as generic type, will be executed by this.
     * <p>
     * Due to java the event can't just parse to the generic type to call the method {@link EventListener#call(Event)}
     * which leads to a helper method {@link EventListener#callUnknown(Event)}.
     * <p>
     * This method throws an exception when the event is not the same as the generic type of the {@link EventListener}.
     *
     * @param event The event to be called.
     * @return Whether the event should be executed or not.
     * This can be only applied to events that implement from {@link Cancellable}. When that is not the case it'll return true.
     */
    boolean call(Event event);

}

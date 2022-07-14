/*
 *  Copyright 14.07.2022 KissenPvP
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
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

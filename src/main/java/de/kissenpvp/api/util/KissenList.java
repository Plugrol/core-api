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

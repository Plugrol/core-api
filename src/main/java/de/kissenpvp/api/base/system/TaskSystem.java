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

package de.kissenpvp.api.base.system;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface TaskSystem
{

    /**
     * This method acts as an interface for creating tasks that are to be repeated.
     * This system is using Ticks, which means 20 of them equals 1 second.
     *
     * @param delay    The delay, which indicates after how many ticks the transferred task will be executed.
     * @param tickRate The rate at which this task should repeat.
     * @param runnable The code itself which should be executed.
     */
    void repeatTask(long delay, long tickRate, Runnable runnable);

    /**
     * Executes a task, possibly with a delay, in the main thread.
     * If you don't want a delay, you can just put something smaller than 0 in there. For example -1.
     *
     * @param delay    The time to wait before taking the action.
     * @param runnable The code itself which should be executed.
     */
    void runTask(long delay, Runnable runnable);
}

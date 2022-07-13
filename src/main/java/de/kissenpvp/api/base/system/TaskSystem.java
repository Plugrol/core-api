/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the Apache
 * License as published by the Apache Software Foundation,
 * either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the Apache License for more details.
 *
 * You should have received a copy of the Apache License
 * along with this program. If not, see <https://www.apache.org/licenses/LICENSE-2.0>.
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

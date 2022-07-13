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

package de.kissenpvp.api.task;

import de.kissenpvp.api.base.Implementation;

import java.util.Set;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Tasks extends Implementation
{
    Task registerTask(String id, int tickRate, Runnable runnable);

    Task registerTask(String id, String group, int tickRate, Runnable runnable);

    Task registerTask(String id, String group, int tickRate, boolean isRunning, Runnable runnable);

    Task registerAsyncTask(String id, int tickRate, Runnable runnable);

    Task registerAsyncTask(String id, String group, int tickRate, Runnable runnable);

    Task registerAsyncTask(String id, String group, int tickRate, boolean isRunning, Runnable runnable);

    Task registerTask(String id, String group, int tickRate, boolean isRunning, boolean async, Runnable runnable);

    boolean endTask(String id);

    int endTasks(String group);

    int endTasks();

    void killTask(String id);

    void killTasks(String group);

    void killTasks();

    Task getTask(String id);

    Set<Task> getTasks();

    Set<Task> getTasks(String group);
}

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

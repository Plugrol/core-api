package de.kissenpvp.api.task;

import de.kissenpvp.api.base.Implementation;

import java.util.Set;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface TaskImplementation extends Implementation
{
    Task registerTask(String id, Runnable runnable);

    Task registerTask(String id, String group, Runnable runnable);

    Task registerTask(String id, String group, boolean isRunning, Runnable runnable);


    Task registerAsyncTask(String id, Runnable runnable);

    Task registerAsyncTask(String id, String group, Runnable runnable);

    Task registerAsyncTask(String id, String group, boolean isRunning, Runnable runnable);

    Task registerTask(String id, String group, boolean isRunning, boolean async, Runnable runnable);

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

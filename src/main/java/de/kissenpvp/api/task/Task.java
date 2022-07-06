package de.kissenpvp.api.task;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Task
{

    String getID();

    String getGroup();

    Runnable getRunnable();

    boolean isAsync();

    int getListener();

    boolean isRunning();

    void setRunning(boolean running);

    void end();

}

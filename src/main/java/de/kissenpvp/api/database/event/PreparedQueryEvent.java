package de.kissenpvp.api.database.event;

import de.kissenpvp.api.event.Cancellable;
import de.kissenpvp.api.event.Event;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public class PreparedQueryEvent implements Event, Cancellable
{
    private String query;
    private boolean cancelled;

    public PreparedQueryEvent(String query)
    {
        this.query = query;
    }

    public String getQuery()
    {
        return query;
    }

    public void setQuery(String query)
    {
        this.query = query;
    }

    @Override public boolean isCancelled()
    {
        return cancelled;
    }

    @Override public void setCancelled(boolean cancel)
    {
        cancelled = cancel;
    }
}

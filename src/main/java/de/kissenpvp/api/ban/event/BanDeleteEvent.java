package de.kissenpvp.api.ban.event;

import de.kissenpvp.api.ban.BanIDNode;
import de.kissenpvp.api.event.Cancellable;
import de.kissenpvp.api.event.Event;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public class BanDeleteEvent implements Event, Cancellable
{
    private final BanIDNode BAN_ID_NODE;
    private boolean cancelled;

    public BanDeleteEvent(BanIDNode banIDNode)
    {
        this.BAN_ID_NODE = banIDNode;
        this.cancelled = false;
    }

    public BanIDNode getBan()
    {
        return BAN_ID_NODE;
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

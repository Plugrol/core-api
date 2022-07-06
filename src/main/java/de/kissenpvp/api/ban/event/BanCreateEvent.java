package de.kissenpvp.api.ban.event;

import de.kissenpvp.api.ban.BanIDNode;
import de.kissenpvp.api.event.Cancellable;
import de.kissenpvp.api.event.Event;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public class BanCreateEvent implements Event, Cancellable
{

    private BanIDNode banIDNode;
    private boolean cancelled;

    public BanCreateEvent(BanIDNode banIDNode)
    {
        this.banIDNode = banIDNode;
        this.cancelled = false;
    }

    public BanIDNode getBan()
    {
        return banIDNode;
    }

    public void setBanIDNode(BanIDNode rankIDNode)
    {
        this.banIDNode = rankIDNode;
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

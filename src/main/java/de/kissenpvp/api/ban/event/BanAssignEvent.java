package de.kissenpvp.api.ban.event;

import de.kissenpvp.api.ban.BanEntry;
import de.kissenpvp.api.ban.BanNode;
import de.kissenpvp.api.event.Cancellable;
import de.kissenpvp.api.event.Event;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public class BanAssignEvent implements Event, Cancellable
{
    private final BanNode BAN_NODE;
    private final BanEntry BAN_ENTRY;
    private boolean cancelled;

    public BanAssignEvent(BanNode banNode, BanEntry banEntry)
    {
        this.BAN_NODE = banNode;
        this.BAN_ENTRY = banEntry;
        this.cancelled = false;
    }

    public BanNode getBanNode()
    {
        return BAN_NODE;
    }

    public BanEntry getBanEntry()
    {
        return BAN_ENTRY;
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

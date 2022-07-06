package de.kissenpvp.api.ban;

import java.util.List;
import java.util.UUID;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface BanEntry
{
    int ban(BanNode banNode);

    boolean unban(String id);

    BanNode getBan(String id);

    List<BanNode> getBan(UUID totalID);

}

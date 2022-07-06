package de.kissenpvp.api.user;

import de.kissenpvp.api.ban.BanEntry;
import de.kissenpvp.api.database.savable.Savable;
import de.kissenpvp.api.permission.GroupablePermissionEntry;
import de.kissenpvp.api.user.rank.RankEntry;

import java.util.UUID;


/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface User extends Savable, GroupablePermissionEntry, RankEntry, BanEntry
{

    UUID getTotalID();

    void setTotalID(UUID totalID);

    String getDisplayName();

    String getLanguage();

    void setLanguage();

    long getTimePlayed();

    long getOnlineTime();
}

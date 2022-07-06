package de.kissenpvp.api.ban;

import java.util.Set;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface BanImplementation
{
    boolean createBanID(BanIDNode banIDNode) throws BanIDAlreadyUsedException;

    boolean deleteBanID(int id);

    BanIDNode getBanID(int id);

    Set<BanIDNode> getBanIDList();
}

package de.kissenpvp.api.permission;

import java.util.Set;

/**
 * A permission group is a group containing permissions and assigns them to the {@link PermissionEntry} which are members of it.
 *
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface PermissionGroup extends PermissionEntry
{
    int delete();

    Set<MemberNode> getMember();
}

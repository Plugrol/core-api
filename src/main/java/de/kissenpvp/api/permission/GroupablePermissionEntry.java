package de.kissenpvp.api.permission;

/**
 * A permission entry which has the ability to be grouped
 *
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface GroupablePermissionEntry extends PermissionEntry
{
    boolean addGroup(PermissionGroup permissionGroup);

    boolean removeGroup(PermissionGroup permissionGroup);
}

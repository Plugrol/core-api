package de.kissenpvp.api.permission;

import java.util.Set;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface PermissionEntry
{
    boolean addPermission(PermissionNode permissionNode, PermissionAgentNode permissionAgent);

    boolean removePermission(PermissionNode permissionNode, PermissionAgentNode permissionAgent);

    Set<PermissionNode> getPermissionList();

    boolean hasPermission(String permission);
}

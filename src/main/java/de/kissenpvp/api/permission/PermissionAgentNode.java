package de.kissenpvp.api.permission;

/**
 * This class is a security layer which provides a instance which is totally allowed to add this permission.
 *
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public record PermissionAgentNode(PermissionEntry permissionEntry) { }

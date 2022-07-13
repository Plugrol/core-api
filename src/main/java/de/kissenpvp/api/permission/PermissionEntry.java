/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the Apache
 * License as published by the Apache Software Foundation,
 * either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the Apache License for more details.
 *
 * You should have received a copy of the Apache License
 * along with this program. If not, see <https://www.apache.org/licenses/LICENSE-2.0>.
 */

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

package de.kissenpvp.api.ban;

import de.kissenpvp.api.util.TimeNode;

import java.util.UUID;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public record BanNode(String id, UUID totalID, String banner, String reason, BanIDNode banIDNode, TimeNode timeNode)
{
}

package de.kissenpvp.api.ban;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public record BanIDNode(int id, String name, BanType banType, long length)
{
    enum BanType
    {
        BAN,
        MUTE,
        KICK
    }
}


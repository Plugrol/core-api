package de.kissenpvp.api.util;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public record TimeNode(long length, long start, long end, long predictedEnd)
{
    public TimeNode setEnd(long end)
    {
        return new TimeNode(length, start, end, predictedEnd);
    }

    public boolean isValid()
    {
        return end > System.currentTimeMillis();
    }

    public boolean hasChanged()
    {
        return end != predictedEnd;
    }
}

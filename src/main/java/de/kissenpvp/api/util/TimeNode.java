package de.kissenpvp.api.util;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public record TimeNode(long length, long start, long end, long predictedEnd)
{
    /**
     * Changes the time this {@link TimeNode} will last, by creating a new one using the same parameters but changing the {@link #end} variable.
     *
     * @param end the new end variable which should be set.
     * @return the new created time node, which then can be updated somewhere.
     */
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

package de.kissenpvp.api.reflection;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public record Parameter<T>(Class<T> type, T value)
{
}

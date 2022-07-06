package de.kissenpvp.api.config;

import de.kissenpvp.api.database.file.File;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Option<T>
{
    String getCode();

    String getGroup();

    String getDescription();

    int getPriority();

    T getDefault();

    T getValue();

    void setValue(T value);

    void setUnsafe(Object value) throws ClassCastException;

    void override(T value, File file);
}

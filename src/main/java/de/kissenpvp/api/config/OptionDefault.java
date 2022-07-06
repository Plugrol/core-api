package de.kissenpvp.api.config;

import de.kissenpvp.api.database.file.File;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public abstract class OptionDefault<T> implements Option<T>
{
    private T value;

    @Override public int getPriority()
    {
        return 0;
    }

    @Override public T getValue()
    {
        return value;
    }

    @Override public void setValue(T value)
    {
        this.value = value;
    }

    @Override public void setUnsafe(Object value) throws ClassCastException
    {
        setValue((T) value);
    }

    @Override public void override(T value, File file)
    {
        setValue(value);
        file.write(getCode(), value, getDescription());
    }
}

package de.kissenpvp.api.base.loader;

import de.kissenpvp.api.reflection.ReflectionClass;

import java.util.Comparator;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Loadable
{
    /**
     * Indicates whether the given class is loadable.
     *
     * @param clazz  The class associated with it.
     * @param plugin The plugin on which the whole thing is registered.
     * @return Whether it's loadable or not.
     */
    boolean isLoadable(ReflectionClass clazz, Object plugin);

    /**
     * Loads the content of the loadable.
     *
     * @param clazz  The class associated with it.
     * @param plugin The plugin on which the whole thing is registered.
     */
    void load(ReflectionClass clazz, Object plugin);

    /**
     * The object to be added to the list.
     *
     * @param clazz The class associated with it.
     * @return The object that is inserted.
     */
    default Object getInsert(ReflectionClass clazz)
    {
        return clazz.getInstance();
    }

    /**
     * Returns a comparator for sorting the list.
     *
     * @return The comparator used for sorting the list.
     */
    default Comparator<?> getComparator()
    {
        return null;
    }

    /**
     * Starts everything that can only be executed after the server has started.
     *
     * @param clazz  The class associated with it.
     * @param plugin The plugin on which the whole thing is registered.
     */
    void enable(ReflectionClass clazz, Object plugin);
}

package de.kissenpvp.api.reflection;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface ReflectionClass
{
    /**
     * Updates the instance loaded in this class.
     *
     * @param instance The instance that is set. This can be {@code null}.
     * @param clazz    The new {@link Class} this class should be about.
     * @return The instance after it was updated.
     */
    ReflectionClass update(Object instance, Class<?> clazz);

    /**
     * Updates the instance loaded in this class.
     *
     * @param clazz The new {@link Class} this class should be about.
     * @return The instance after it was updated.
     */
    ReflectionClass update(Class<?> clazz);

    /**
     * Updates the instance loaded in this class.
     *
     * @param instance The instance that is set. This can be {@code null}.
     * @return The instance after it was updated.
     */
    ReflectionClass update(Object instance);

    /**
     * Executes a method.
     * Can only be used if an instance has already been created or transferred.
     * In addition to {@link #executeUnsafe(String, Parameter[])} (String, Object...)} it does handle exceptions.
     *
     * @param method     The id of the method to be executed.
     * @param parameters The parameters to be passed.
     * @return The return value of the executed method.
     */
    Object execute(String method, Parameter<?>... parameters);

    /**
     * Executes a method.
     * Can only be used if an instance has already been created or transferred.
     *
     * @param method     The id of the method to be executed.
     * @param parameters The parameters to be passed.
     * @return The return value of the executed method.
     * @throws InvocationTargetException is thrown when the method produces errors or the parameters are wrong.
     * @throws IllegalAccessException    is thrown when the method isn't reachable by this class.
     * @throws NoSuchMethodException     is thrown when the class do not exist.
     */
    Object executeUnsafe(String method, Parameter<?>... parameters) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException;

    /**
     * This method edits private variables of objects.
     *
     * @param field    The id of the variable, that should be edited.
     * @param newValue The new value that will be set.
     */
    void setField(String field, Object newValue);

    /**
     * Get values of private variables.
     *
     * @param field The id of the variable, which should be revealed.
     * @return The value of the variable.
     */
    Object getField(String field);

    /**
     * Searches for a specific type of variable in a class and return its value.
     * When there are more variable with the same type, it'll return the first.
     *
     * @param field of variable to search for.
     * @return the value, that this variable contains.
     */
    <T> T getField(Class<T> field);

    /**
     * Set a static variable from a class. This must be {@code private}.
     *
     * @param field    The id of the variable.
     * @param newValue The new value of the variable.
     */
    void setStatic(String field, Object newValue);

    /**
     * Get a static variable from a class. This must be {@code private}.
     *
     * @param field The id of the variable.
     * @return The value of the static variable.
     */
    Object getStatic(String field);

    /**
     * Get the current instance of the class
     * can be null.
     *
     * @return The current instance.
     */
    Object getInstance();

    /**
     * Set an existing instance to the class instance
     *
     * @param instance The new instance of the class.
     */
    void setInstance(Object instance);

    /**
     * Add an instance to the class.
     * The instance can be null, to remove.
     *
     * @param parameters The parameters of the class.
     * @return The created instance of the class with the given parameters.
     */
    Object newInstance(Parameter<?>... parameters);

    /**
     * Creates an empty instance of the class.
     *
     * @return An instance of the class whose parameters are all set to {@code null}.
     */
    Object newInstance();

    /**
     * The package this class is in.
     *
     * @return The Package as reflection package.
     */
    Package getPackage();

    /**
     * Get the Class as java version and get other things.
     *
     * @return The java class of this class type.
     */
    Class<?> getJavaClass();

    /**
     * @return if it's an interface.
     */
    boolean isInterface();

    /**
     * @return whether it's abstract or not.
     */
    boolean isAbstract();
}

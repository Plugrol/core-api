package de.kissenpvp.api.reflection;

import de.kissenpvp.api.base.Implementation;

import java.util.jar.JarFile;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface ReflectionImplementation extends Implementation
{

    /**
     * This constructor creates a class from a
     * plain java class and provides helpful
     * functions that are often needed when
     * working with JavaReflection.
     * <p>
     * Creates a class core with specification of the class. The instance is also transferred here immediately.
     *
     * @param instance The instance to be set.
     * @param clazz    The class from which the reflection help is needed.
     */
    ReflectionClass loadClass(Object instance, Class<?> clazz);

    /**
     * This constructor creates a class from a
     * plain java class and provides helpful
     * functions that are often needed when
     * working with JavaReflection.
     *
     * @param clazz The class from which the reflection help is needed.
     * @see Class
     */
    ReflectionClass loadClass(Class<?> clazz);

    /**
     * This constructor creates a class from a
     * plain java class and provides helpful
     * functions that are often needed when
     * working with JavaReflection.
     * <p>
     * Creates a class core based on an instance and its class.
     *
     * @param instance The instance to be set.
     */
    ReflectionClass loadClass(Object instance);

    /**
     * Creates a reflection class based on its position, which must be specified as follows:
     * If you want to create a class that is a <code>String</code>,
     * the argument must be called <code>java.lang.String</code>.
     * Only <code>String</code> is not allowed. Also, it's case-sensitive.
     *
     * @param clazz The class from which the reflection help is needed.
     * @throws ClassNotFoundException If the give path does not exist.
     */
    ReflectionClass loadClass(String clazz) throws ClassNotFoundException;

    ReflectionPackage loadPackage(String packagePath, JarFile jarFile);
}

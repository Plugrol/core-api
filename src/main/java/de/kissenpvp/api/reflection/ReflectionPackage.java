package de.kissenpvp.api.reflection;

import java.util.List;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface ReflectionPackage
{
    /**
     * This method indicates which package it is.
     *
     * @return The path in the project, which marks where it shows its affiliation.
     */
    String getPath();

    /**
     * Get a class in this package and load it
     *
     * @param name The id of the Class
     * @return The loaded Class.
     */
    ReflectionClass getClass(String name);

    /**
     * Get the classes that are in the package.
     *
     * @return The classes as a list.
     */
    List<ReflectionClass> getClasses();

    /**
     * Get the classes that are in the package.
     *
     * @return The classes as a list.
     */
    List<String> getUnsafeClasses();

    /**
     * Get the classes that are in the package.
     * And filter the classes, that are assignable to the given class.
     *
     * @param assignable The classes, which indicates what type they should be.
     * @return A list of the filtered classes, which are assignable to the given classes
     */
    List<ReflectionClass> getClasses(ReflectionClass... assignable);

    /**
     * Get the Java package and its information.
     *
     * @return The package as a Java package.
     */
    Package getJavaPackage();
}

/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the Apache
 * License as published by the Apache Software Foundation,
 * either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the Apache License for more details.
 *
 * You should have received a copy of the Apache License
 * along with this program. If not, see <https://www.apache.org/licenses/LICENSE-2.0>.
 */

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

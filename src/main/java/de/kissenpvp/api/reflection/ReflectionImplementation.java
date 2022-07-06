/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the GNU General Public
 * License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

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

package de.kissenpvp.api.base.loader;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotates classes, which should be stored in the {@link ClassScanner#getList(Class)}
 *
 * @author groldi
 * @since 0.0.1-SNAPSHOT
 */
@Target(value = {ElementType.TYPE}) @Retention(RetentionPolicy.RUNTIME) public @interface Find
{
    /**
     * @return whether is accepts abstract classes, or just ignores them.
     */
    boolean value() default true;
}

package de.kissenpvp.api.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
@Target(value = {ElementType.TYPE}) @Retention(RetentionPolicy.RUNTIME) public @interface Command
{
    String command();

    String description() default "No description.";

    String[] usages() default {};

    String[] alias() default {};

    boolean consoleAllowed() default true;

    boolean admin() default false;
}

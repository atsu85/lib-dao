package org.jskele.libs.dao;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * When generating sql, update columns with <code>null</code> value and except provided column names.
 */
@Target({METHOD})
@Retention(RUNTIME)
public @interface IncludeNullsExcept {

    String[] exceptParamNames() default {};

}

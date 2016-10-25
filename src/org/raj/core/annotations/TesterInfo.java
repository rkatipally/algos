package org.raj.core.annotations;

import java.lang.annotation.*;

/**
 * Created by RJK on 10/19/2016.
 */

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface TesterInfo {

    public enum Priority{
        LOW, MEDIUM, HIGH
    }

    Priority priority() default Priority.MEDIUM;


}

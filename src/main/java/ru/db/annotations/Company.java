package ru.db.annotations;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Company{
    String name() default "Default of Name";
    String city() default "Default of City";
}

package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyDefaultValue {
    String stringValue() default "";
    int intValue() default 0;
    long longValue() default 0l;
    float floatValue() default 0f;
    double doubleValue() default 0d;
    char charValue() default '\u0000';
}

package Annotation;

import java.lang.reflect.Field;
import java.util.Objects;

public class MyDefaultValueInitializer {
    public static void initialize(Object obj) throws IllegalAccessException {
        final Class<?> clazz = obj.getClass();

        for(Field field : clazz.getDeclaredFields()) {
            if(field.isAnnotationPresent(MyDefaultValue.class)) {
                final MyDefaultValue annotation = field.getAnnotation(MyDefaultValue.class);
                field.setAccessible(true);

                if(field.getType() == String.class && Objects.isNull(field.get(obj))) {
                    field.set(obj, annotation.stringValue());
                } else if(field.getType() == int.class && field.get(obj).equals(0)) {
                    field.set(obj, annotation.intValue());
                } else if(field.getType() == long.class && field.get(obj).equals(0L)) {
                    field.set(obj, annotation.longValue());
                } else if(field.getType() == float.class && field.get(obj).equals(0f)) {
                    field.set(obj, annotation.floatValue());
                } else if(field.getType() == double.class && field.get(obj).equals(0d)) {
                    field.set(obj, annotation.doubleValue());
                } else if(field.getType() == char.class && field.get(obj).equals('\u0000')) {
                    field.set(obj, annotation.charValue());
                }
            }
        }
    }
}

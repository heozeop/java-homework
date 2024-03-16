package Annotation;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Annotation {
    @Test
    void DEFAULT_ANNOTATION() {
        MyObject myObject = new MyObject();
        try {
            MyDefaultValueInitializer.initialize(myObject);
        } catch (IllegalAccessException e) {
            assertThat(e).isNull();
        }

        assertThat(myObject.value1).isEqualTo(1);
        assertThat(myObject.value2).isEqualTo(1L);
        assertThat(myObject.value3).isEqualTo(1f);
        assertThat(myObject.value4).isEqualTo(1d);
        assertThat(myObject.value5).isEqualTo('a');
        assertThat(myObject.value6).isEqualTo("hello annotation");
    }
}

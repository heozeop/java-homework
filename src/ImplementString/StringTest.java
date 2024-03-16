package ImplementString;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    void 케이스별_출력() {
        final StringImpl string = new StringImpl("HhEeLlLlOo JpArVoAgramming".toCharArray());

        assertThat(string.filterCase(true).toString()).isEqualTo("HELLOJAVA");
        assertThat(string.filterCase(false).toString()).isEqualTo("helloprogramming");
    }
}

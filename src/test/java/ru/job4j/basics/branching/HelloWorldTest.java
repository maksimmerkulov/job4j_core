package ru.job4j.basics.branching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link HelloWorld} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class HelloWorldTest {

    /** Verifies divisibility by both {@code 3} and {@code 5}. */
    @Test
    void when15ThenHelloWorld() {
        assertThat(HelloWorld.checkNumber(15))
                .isEqualTo("Hello, World!!!");
    }

    /** Verifies divisibility by {@code 3} only. */
    @Test
    void when9ThenHello() {
        assertThat(HelloWorld.checkNumber(9))
                .isEqualTo("Hello");
    }

    /** Verifies divisibility by {@code 5} only. */
    @Test
    void when25ThenWorld() {
        assertThat(HelloWorld.checkNumber(25))
                .isEqualTo("World");
    }

    /** Verifies the case when no conditions are met. */
    @Test
    void when14ThenNotSupport() {
        assertThat(HelloWorld.checkNumber(14))
                .isEqualTo("Operation not support");
    }
}

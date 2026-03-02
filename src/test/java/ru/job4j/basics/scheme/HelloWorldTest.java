package ru.job4j.basics.scheme;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link HelloWorld} class.
 *
 * @author Maksim Merkulov
 * @version 1.7
 */
class HelloWorldTest {

    /** Verifies the console output of the {@code main} method. */
    @Test
    void whenMainThenPrintHelloJob4j() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        HelloWorld.main(null);
        System.setOut(stdout);
        assertThat(out.toString())
                .isEqualTo("Hello, Job4j!" + System.lineSeparator());
    }
}

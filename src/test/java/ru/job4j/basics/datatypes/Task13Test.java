package ru.job4j.basics.datatypes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Task13} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class Task13Test {

    /**
     * Verifies currency conversion for input {@code 15} at rate {@code 60.85}.
     */
    @Test
    void whenInput15AndRate60Point85ThenPrint912Point75() {
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        System.setIn(new ByteArrayInputStream("15 60.85".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task13.main(null);
        System.setIn(stdin);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("912.75");
    }

    /**
     * Verifies currency conversion for input {@code 5} at rate {@code 1.01}.
     */
    @Test
    void whenInput5AndRate1Point01ThenPrint5Point05() {
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        System.setIn(new ByteArrayInputStream("5 1.01".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task13.main(null);
        System.setIn(stdin);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("5.05");
    }

    /**
     * Verifies currency conversion for input {@code 50} at rate {@code 0.87}.
     */
    @Test
    void whenInput50AndRate0Point87ThenPrint43Point50() {
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        System.setIn(new ByteArrayInputStream("50 0.87".getBytes()));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task13.main(null);
        System.setIn(stdin);
        System.setOut(stdout);
        assertThat(out.toString()).isEqualTo("43.50");
    }
}

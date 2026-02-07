package ru.job4j.basics.console;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Модульные тесты класса {@link Task13}.
 *
 * <p>Проверяется корректность работы метода {@link Task13#main(String[])}
 * при вводе двух чисел и выводе результатов арифметических операций
 * на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task13Test {

    /**
     * Проверяет метод {@link Task13#main(String[])} при вводе чисел 1.0 и 0.1.
     *
     * <p>Ожидаемый результат: вывод суммы, разности, произведения и частного
     * на консоль.</p>
     */
    @Test
    public void when1Point0And0Point1ThenCalculations() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String input = String.format("%f %f", 1.0, 0.1);
        System.setIn(new ByteArrayInputStream(
                input.getBytes()
        ));
        System.setOut(new PrintStream(out));
        Task13.main(null);
        String expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator()
        )
                .add("1.1")
                .add("0.9")
                .add("0.1")
                .add("10.0")
                .toString();
        assertThat(out.toString(), is(expected));
    }
}

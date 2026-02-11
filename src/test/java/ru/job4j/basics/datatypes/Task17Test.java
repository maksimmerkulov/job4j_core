package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task17}.
 *
 * <p>Проверяется корректность работы метода {@link Task17#calculate(int, int)}
 * с различными входными значениями.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task17Test {

    /**
     * Проверяет метод {@link Task17#calculate(int, int)}
     * для значений {@code base = 5} и {@code height = 4}.
     *
     * <p>Ожидаемый результат: {@code 10.0, 18.0}.</p>
     */
    @Test
    public void when5And4Then10dot0And18dot0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.calculate(5, 4);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator())
                .add("10.0").add("18.0");
        assertThat(out.toString(), is(expected.toString()));
    }

    /**
     * Проверяет метод {@link Task17#calculate(int, int)}
     * для значений {@code base = 3} и {@code height = 3}.
     *
     * <p>Ожидаемый результат: {@code 4.5, 12.0}.</p>
     */
    @Test
    public void when3And3Then4dot5And12dot0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.calculate(3, 3);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator())
                .add("4.5").add("12.0");
        assertThat(out.toString(), is(expected.toString()));
    }

    /**
     * Проверяет метод {@link Task17#calculate(int, int)}
     * для значений {@code base = 1} и {@code height = 7}.
     *
     * <p>Ожидаемый результат: {@code 3.5, 16.0}.</p>
     */
    @Test
    public void when1And7Then3dot5And16dot0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.calculate(1, 7);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator())
                .add("3.5").add("16.0");
        assertThat(out.toString(), is(expected.toString()));
    }
}

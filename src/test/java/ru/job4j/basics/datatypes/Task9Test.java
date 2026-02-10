package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Модульные тесты класса {@link Task9}.
 *
 * <p>Проверяется корректность работы метода {@link Task9#main(String[])}
 * при вводе двух чисел через стандартный поток ввода.</p>
 *
 * <p>Результат выполнения программы сравнивается с ожидаемым выводом.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task9Test {

    /**
     * Проверяет работу программы при вводе чисел {@code 1} и {@code 1}.
     *
     * <p>Ожидаемый результат: {@code 2, 0, 1, 1}.</p>
     */
    @Test
    public void when1And1() {
        ByteArrayInputStream in = new ByteArrayInputStream("1 1".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task9.main(null);
        StringJoiner expect = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("2").add("0").add("1").add("1");
        assertThat(out.toString(), is(expect.toString()));
    }

    /**
     * Проверяет работу программы при вводе чисел {@code 2} и {@code 2}.
     *
     * <p>Ожидаемый результат: {@code 4, 0, 4, 1}.</p>
     */
    @Test
    public void when2And2() {
        ByteArrayInputStream in = new ByteArrayInputStream("2 2".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task9.main(null);
        StringJoiner expect = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("4").add("0").add("4").add("1");
        assertThat(out.toString(), is(expect.toString()));
    }
}

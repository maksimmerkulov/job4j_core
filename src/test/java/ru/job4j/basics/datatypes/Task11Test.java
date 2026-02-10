package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task11}.
 *
 * <p>Проверяется корректность вычисления длины в дюймах
 * на основе введенного значения в сантиметрах
 * и вывода результата с точностью до двух знаков после запятой.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task11Test {

    /**
     * Проверяет перевод {@code 1} сантиметра в дюймы.
     *
     * <p>Ожидаемый результат: {@code 0.39}.</p>
     */
    @Test
    public void when1CMThen0dot39Inches() {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task11.main(null);
        String expected = "0.39";
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет перевод {@code 50} сантиметров в дюймы.
     *
     * <p>Ожидаемый результат: {@code 19.69}.</p>
     */
    @Test
    public void when50CMThen19dot69Inches() {
        ByteArrayInputStream in = new ByteArrayInputStream("50".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task11.main(null);
        String expected = "19.69";
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет перевод {@code 200} сантиметров в дюймы.
     *
     * <p>Ожидаемый результат: {@code 78.74}.</p>
     */
    @Test
    public void when200CMThen78dot74Inches() {
        ByteArrayInputStream in = new ByteArrayInputStream("200".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task11.main(null);
        String expected = "78.74";
        assertThat(out.toString(), is(expected));
    }
}

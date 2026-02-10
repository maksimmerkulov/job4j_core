package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task14}.
 *
 * <p>Проверяется корректность работы программы {@link Task14}
 * при вычислении периметра и площади прямоугольного треугольника
 * по длинам катетов и гипотенузы.</p>
 *
 * <p>Результаты проверяются с точностью до одной цифры после запятой.
 * Для тестирования используется перенаправление потоков ввода и вывода
 * с помощью {@link ByteArrayInputStream} и {@link ByteArrayOutputStream}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task14Test {

    /**
     * Проверяет вычисление периметра и площади
     * для треугольника со сторонами {@code 3 4 5}.
     *
     * <p>Ожидаемый результат:</p>
     * <p>{@code 12.0}</p>
     * <p>{@code 6.0}</p>
     */
    @Test
    public void whenA3B4C5ThenPerimeter12Area6() {
        ByteArrayInputStream in =
                new ByteArrayInputStream("3 4 5".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task14.main(null);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator())
                .add("12.0").add("6.0");
        assertThat(out.toString(), is(expected.toString()));
    }

    /**
     * Проверяет вычисление периметра и площади
     * для треугольника со сторонами {@code 2.4 8.5 8.8}.
     *
     * <p>Ожидаемый результат:</p>
     * <p>{@code 19.7}</p>
     * <p>{@code 10.2}</p>
     */
    @Test
    public void whenA3B4C5ThenPerimeter12Area62() {
        ByteArrayInputStream in =
                new ByteArrayInputStream("2.4 8.5 8.8".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task14.main(null);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator())
                .add("19.7").add("10.2");
        assertThat(out.toString(), is(expected.toString()));
    }

    /**
     * Проверяет вычисление периметра и площади
     * для треугольника со сторонами {@code 5 7 8.6}.
     *
     * <p>Ожидаемый результат:</p>
     * <p>{@code 20.6}</p>
     * <p>{@code 17.5}</p>
     */
    @Test
    public void whenA5B7C8dot6ThenPerimeter20dot6Area17dot5() {
        ByteArrayInputStream in =
                new ByteArrayInputStream("5 7 8.6".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task14.main(null);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator())
                .add("20.6").add("17.5");
        assertThat(out.toString(), is(expected.toString()));
    }
}

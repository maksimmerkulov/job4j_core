package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link ShortType}.
 *
 * <p>Проверяется корректность чтения значения типа {@code short}
 * из стандартного ввода и его вывода на консоль
 * методом {@link ShortType#main(String[])}.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом
 * с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ShortTypeTest {

    /**
     * Проверяет метод {@link ShortType#main(String[])}
     * при вводе значения {@code 4}.
     *
     * <p>Ожидаемый результат: {@code 4}.</p>
     */
    @Test
    public void whenEnter4() {
        ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        ShortType.main(null);
        assertThat(out.toString(), is("4" + System.lineSeparator()));
    }

    /**
     * Проверяет метод {@link ShortType#main(String[])}
     * при вводе значения {@code 5}.
     *
     * <p>Ожидаемый результат: {@code 5}.</p>
     */
    @Test
    public void whenEnter5() {
        ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        ShortType.main(null);
        assertThat(out.toString(), is("5" + System.lineSeparator()));
    }
}

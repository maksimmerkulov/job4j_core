package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link IntType}.
 *
 * <p>Проверяется корректность чтения целого числа из стандартного ввода
 * и вывода его на консоль методом {@link IntType#main(String[])}.</p>
 *
 * <p>Результаты сравниваются с ожидаемым значением
 * с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class IntTypeTest {

    /**
     * Проверяет метод {@link IntType#main(String[])} при вводе числа {@code 4}.
     *
     * <p>Ожидаемый результат: введенное число выводится на консоль.</p>
     */
    @Test
    public void whenEnter4() {
        ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        IntType.main(null);
        assertThat(out.toString(), is("4" + System.lineSeparator()));
    }
}

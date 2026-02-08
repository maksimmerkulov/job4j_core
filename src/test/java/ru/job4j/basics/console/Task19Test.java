package ru.job4j.basics.console;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Модульные тесты класса {@link Task19}.
 *
 * <p>Проверяется корректность вывода значения переменной {@code x}
 * и ее квадрата на консоль методом {@link Task19#main(String[])}.</p>
 *
 * <p>Результаты сравниваются с ожидаемой строкой с учетом переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task19Test {

    /**
     * Проверяет метод {@link Task19#main(String[])} при выводе строки
     * со значением переменной {@code x} и значением ее квадрата.
     *
     * <p>Ожидаемый результат: корректные строки с переносами.</p>
     */
    @Test
    public void shouldOutputStringPlusNumber() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.main(null);
        String expected = "Значение x равно 9" + System.lineSeparator()
                + "Значение x^2 равно 81" + System.lineSeparator();
        assertThat(out.toString(), is(expected));
    }
}

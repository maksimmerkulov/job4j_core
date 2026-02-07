package ru.job4j.basics.console;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Модульные тесты класса {@link Task14}.
 *
 * <p>Проверяется корректность вывода текста на консоль
 * методом {@link Task14#main(String[])} с дефисами между символами.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task14Test {

    /**
     * Проверяет метод {@link Task14#main(String[])}
     * при выводе строки с дефисами между символами.
     *
     * <p>Ожидаемый результат: строка "H-e-l-l-o-,-f-r-i-e-n-d!" на консоль.</p>
     */
    @Test
    public void whenDelimiterIsPastedBetweenLettersOfString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task14.main(null);
        assertThat(out.toString(), is("H-e-l-l-o-,-f-r-i-e-n-d!"));
    }
}

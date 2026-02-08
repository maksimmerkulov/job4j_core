package ru.job4j.basics.console;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Модульные тесты класса {@link Task17}.
 *
 * <p>Проверяется корректность вывода числа, его квадрата и куба на консоль
 * методом {@link Task17#main(String[])}.</p>
 *
 * <p>Результаты сравниваются с ожидаемой строкой
 * с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task17Test {

    /**
     * Проверяет метод {@link Task17#main(String[])} для числа 6.
     *
     * <p>Ожидаемый результат: вывод числа 6, его квадрата 36 и куба 216,
     * каждый на новой строке.</p>
     */
    @Test
    public void shouldOutputSqrAndCubeOf6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.main(null);
        String expected = "6" + System.lineSeparator()
                + "36" + System.lineSeparator()
                + "216" + System.lineSeparator();
        assertThat(out.toString(), is(expected));
    }
}

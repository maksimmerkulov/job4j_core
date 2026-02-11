package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task24}.
 *
 * <p>Проверяется корректность работы метода {@link Task24#separate(int)}
 * и вывод результата в стандартный поток вывода.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом
 * с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task24Test {

    /** Перенос строки для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет разложение числа {@code 35}.
     *
     * <p>Ожидаемый результат: {@code 30+5}.</p>
     */
    @Test
    public void when35Then30Plus5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.separate(35);
        String expected = "30+5" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет разложение числа {@code 19}.
     *
     * <p>Ожидаемый результат: {@code 10+9}.</p>
     */
    @Test
    public void when19Then10Plus9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.separate(19);
        String expected = "10+9" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет разложение числа {@code 63}.
     *
     * <p>Ожидаемый результат: {@code 60+3}.</p>
     */
    @Test
    public void when63Then60Plus3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.separate(63);
        String expected = "60+3" + ln;
        assertThat(out.toString(), is(expected));
    }
}

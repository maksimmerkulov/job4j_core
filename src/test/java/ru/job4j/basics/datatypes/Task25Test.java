package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task25}.
 *
 * <p>Проверяется корректность работы метода {@link Task25#separate(int)}
 * и вывод результата в стандартный поток вывода.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом
 * с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task25Test {

    /** Перенос строки для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет разложение числа {@code 335}.
     *
     * <p>Ожидаемый результат: {@code 300+30+5}.</p>
     */
    @Test
    public void when335Then300Plus30Plus5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.separate(335);
        String expected = "300+30+5" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет разложение числа {@code 760}.
     *
     * <p>Ожидаемый результат: {@code 700+60+0}.</p>
     */
    @Test
    public void when760Then700Plus60Plus0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.separate(760);
        String expected = "700+60+0" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет разложение числа {@code 100}.
     *
     * <p>Ожидаемый результат: {@code 100+0+0}.</p>
     */
    @Test
    public void when100Then100Plus0Plus0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.separate(100);
        String expected = "100+0+0" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет разложение числа {@code 109}.
     *
     * <p>Ожидаемый результат: {@code 100+0+9}.</p>
     */
    @Test
    public void when109Then100Plus0Plus9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.separate(109);
        String expected = "100+0+9" + ln;
        assertThat(out.toString(), is(expected));
    }
}

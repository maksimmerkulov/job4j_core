package ru.job4j.basics.console;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task22}.
 *
 * <p>Проверяется корректность работы метода {@link Task22#nameInsert(String)}
 * с различными именами пользователей.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми строками приветствия,
 * с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task22Test {

    /** Разделитель строк для удобства сравнения вывода. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task22#nameInsert(String)} с именем "Петр".
     *
     * <p>Ожидаемый результат: строка "Привет, Петр!" с переносом строки.</p>
     */
    @Test
    public void whenPetrThenHiPetr() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.nameInsert("Петр");
        String expected = "Привет, Петр!" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task22#nameInsert(String)} с именем "Иван".
     *
     * <p>Ожидаемый результат: строка "Привет, Иван!" с переносом строки.</p>
     */
    @Test
    public void whenIvanThenHiIvan() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.nameInsert("Иван");
        String expected = "Привет, Иван!" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task22#nameInsert(String)} с именем "Елена".
     *
     * <p>Ожидаемый результат: строка "Привет, Елена!" с переносом строки.</p>
     */
    @Test
    public void whenElenThenHiElena() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.nameInsert("Елена");
        String expected = "Привет, Елена!" + ln;
        assertThat(out.toString(), is(expected));
    }
}

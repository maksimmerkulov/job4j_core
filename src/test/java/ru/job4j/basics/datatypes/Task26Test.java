package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task26}.
 *
 * <p>Проверяется корректность работы метода {@link Task26#transform(int)}
 * для различных двузначных чисел,
 * с выводом результата в стандартный поток вывода.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом
 * с учетом системного переноса строки.</p>
 *
 * <p>Примеры использования: преобразование числа {@code 37} в {@code 81},
 * числа {@code 49} в {@code 102} и числа {@code 10} в {@code 9}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task26Test {

    /** Перенос строки для текущей платформы. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task26#transform(int)} для числа {@code 37}.
     *
     * <p>Ожидаемый результат: {@code 81}.</p>
     */
    @Test
    public void when37Then81() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.transform(37);
        String expected = "81" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task26#transform(int)} для числа {@code 49}.
     *
     * <p>Ожидаемый результат: {@code 102}.</p>
     */
    @Test
    public void when49Then102() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.transform(49);
        String expected = "102" + ln;
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task26#transform(int)} для числа {@code 10}.
     *
     * <p>Ожидаемый результат: {@code 9}.</p>
     */
    @Test
    public void when10Then9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.transform(10);
        String expected = "9" + ln;
        assertThat(out.toString(), is(expected));
    }
}

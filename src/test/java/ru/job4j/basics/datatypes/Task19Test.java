package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Task19}.
 *
 * <p>Проверяется корректность работы
 * метода {@link Task19#sumAndConvert(double, double, double)}
 * при сложении денежных сумм
 * и конвертации в евро с различными входными значениями.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями с точностью до двух знаков
 * после запятой.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task19Test {

    /**
     * Проверяет метод {@link Task19#sumAndConvert(double, double, double)}
     * для суммы {@code 5000} и подарка {@code 7000} с курсом {@code 0.016516}.
     *
     * <p>Ожидаемый результат: {@code 198.19}.</p>
     */
    @Test
    public void when5000And7000And0dot016516Then198dot19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumAndConvert(5000, 7000, 0.016516);
        String expected = "198.19";
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task19#sumAndConvert(double, double, double)}
     * для суммы {@code 1500} и подарка {@code 10000} с курсом {@code 0.019}.
     *
     * <p>Ожидаемый результат: {@code 218.50}.</p>
     */
    @Test
    public void when1500And10000And0dot02Then198dot19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumAndConvert(1500, 10000, 0.019);
        String expected = "218.50";
        assertThat(out.toString(), is(expected));
    }

    /**
     * Проверяет метод {@link Task19#sumAndConvert(double, double, double)}
     * для суммы {@code 550} и подарка {@code 100} с курсом {@code 0.01954}.
     *
     * <p>Ожидаемый результат: {@code 12.70}.</p>
     */
    @Test
    public void when550And100And0dot01954Then198dot19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.sumAndConvert(550, 100, 0.01954);
        String expected = "12.70";
        assertThat(out.toString(), is(expected));
    }
}

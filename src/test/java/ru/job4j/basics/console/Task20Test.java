package ru.job4j.basics.console;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

/**
 * Модульные тесты класса {@link Task20}.
 *
 * <p>Проверяется корректность работы метода {@link Task20#print(int, int)}
 * с различными значениями переменных {@code x} и {@code y}.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями строк,
 * содержащих переменные, их сумму и произведение.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task20Test {

    /** Разделитель строк для удобства сравнения вывода. */
    public String ln = System.lineSeparator();

    /**
     * Проверяет метод {@link Task20#print(int, int)} для аргументов 1 и 1.
     *
     * <p>Ожидаемый результат: "Переменные: 1 1", "Сумма: 2",
     * "Произведение: 1".</p>
     */
    @Test
    public void when1And1Then11And2And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.print(1, 1);
        StringJoiner expected = new StringJoiner(
                ln, "", ln)
                .add("Переменные: 1 1").add("Сумма: 2").add("Произведение: 1");
        Assert.assertThat(out.toString(), Is.is(expected.toString()));
    }

    /**
     * Проверяет метод {@link Task20#print(int, int)} для аргументов 3 и 5.
     *
     * <p>Ожидаемый результат: "Переменные: 3 5", "Сумма: 8",
     * "Произведение: 15".</p>
     */
    @Test
    public void when3And5Then35And8And15() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.print(3, 5);
        StringJoiner expected = new StringJoiner(
                ln, "", ln)
                .add("Переменные: 3 5").add("Сумма: 8").add("Произведение: 15");
        Assert.assertThat(out.toString(), Is.is(expected.toString()));
    }

    /**
     * Проверяет метод {@link Task20#print(int, int)} для аргументов 2 и 3.
     *
     * <p>Ожидаемый результат: "Переменные: 2 3", "Сумма: 5",
     * "Произведение: 6".</p>
     */
    @Test
    public void when2And3Then23And5And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.print(2, 3);
        StringJoiner expected = new StringJoiner(
                ln, "", ln)
                .add("Переменные: 2 3").add("Сумма: 5").add("Произведение: 6");
        Assert.assertThat(out.toString(), Is.is(expected.toString()));
    }
}

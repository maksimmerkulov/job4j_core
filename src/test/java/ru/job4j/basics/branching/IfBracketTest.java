package ru.job4j.basics.branching;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link IfBracket}.
 *
 * <p>Проверяется корректность работы метода {@link IfBracket#show(int)}
 * при различных значениях входного параметра.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class IfBracketTest {

    /**
     * Проверяет метод {@link IfBracket#show(int)} для числа {@code 2}.
     *
     * <p>Ожидаемый результат: вывод строк {@code A} и {@code B}.</p>
     */
    @Test
    public void when2ThenAB() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IfBracket.show(2);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "A" + ln + "B" + ln
        ));
    }

    /**
     * Проверяет метод {@link IfBracket#show(int)} для числа {@code 0}.
     *
     * <p>Ожидаемый результат: отсутствует вывод на консоль.</p>
     */
    @Test
    public void when0ThenNoOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IfBracket.show(0);
        assertThat(out.toString(), is(""));
    }
}

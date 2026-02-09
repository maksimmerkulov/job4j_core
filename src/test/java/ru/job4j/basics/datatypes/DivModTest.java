package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link DivMod}.
 *
 * <p>Проверяется корректность вычисления результата целочисленного деления
 * и остатка от деления методом {@link DivMod#main(String[])}.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями
 * с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class DivModTest {

    /**
     * Проверяет метод {@link DivMod#main(String[])}
     * на корректность вывода результата деления и остатка.
     *
     * <p>Ожидаемый результат: вывод значений {@code 3} и {@code 2}
     * на отдельных строках.</p>
     */
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        DivMod.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("3" + ln + "2" + ln));
    }
}

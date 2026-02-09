package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link IntegerPart}.
 *
 * <p>Проверяется корректность вывода целой части числа с плавающей точкой
 * методом {@link IntegerPart#main(String[])}.</p>
 *
 * <p>Результаты сравниваются с ожидаемой строкой
 * с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class IntegerPartTest {

    /**
     * Проверяет метод {@link IntegerPart#main(String[])}
     * при выводе целой части числа {@code 2.6}.
     *
     * <p>Ожидаемый результат: вывод числа {@code 2} с переводом строки.</p>
     */
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IntegerPart.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "2" + ln
        ));
    }
}

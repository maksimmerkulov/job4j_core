package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link IntegerTypeConversion}.
 *
 * <p>Проверяется корректность вывода результатов преобразования типов
 * методом {@link IntegerTypeConversion#main(String[])}.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями
 * с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class IntegerTypeConversionTest {

    /**
     * Проверяет метод {@link IntegerTypeConversion#main(String[])}
     * при выводе результатов преобразования типов.
     *
     * <p>Ожидаемый результат: на консоль выводятся два значения {@code 1}
     * на отдельных строках.</p>
     */
    @Test
    public void testOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IntegerTypeConversion.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("1" + ln + "1" + ln));
    }
}

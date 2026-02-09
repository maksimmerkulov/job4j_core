package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link MathAbs}.
 *
 * <p>Проверяется корректность вычисления модуля числа
 * методом {@link MathAbs#main(String[])} и вывода результата на консоль.</p>
 *
 * <p>Результаты сравниваются с ожидаемым значением {@code 5.0}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MathAbsTest {

    /**
     * Проверяет метод {@link MathAbs#main(String[])}.
     *
     * <p>Ожидаемый результат: на консоль выводится число {@code 5.0}.</p>
     */
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MathAbs.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "5.0" + ln
        ));
    }
}

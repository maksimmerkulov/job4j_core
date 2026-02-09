package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link MathSqrt}.
 *
 * <p>Проверяется корректность работы метода {@link MathSqrt#main(String[])}
 * для вычисления квадратного корня числа.</p>
 *
 * <p>Результаты сравниваются с ожидаемым значением, выводимым на консоль
 * с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MathSqrtTest {

    /**
     * Проверяет метод {@link MathSqrt#main(String[])} для числа {@code 9}.
     *
     * <p>Ожидаемый результат: {@code 3.0} с переносом строки на консоли.</p>
     */
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MathSqrt.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "3.0" + ln
        ));
    }
}

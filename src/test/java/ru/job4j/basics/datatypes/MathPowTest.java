package ru.job4j.basics.datatypes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link IntegerPart}.
 *
 * <p>Проверяется корректность работы метода {@link IntegerPart#main(String[])}
 * для извлечения целой части числа с плавающей точкой.</p>
 *
 * <p>Результаты сравниваются с ожидаемым целым числом, выводимым на консоль
 * с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MathPowTest {

    /**
     * Проверяет метод {@link IntegerPart#main(String[])}
     * для числа {@code 2.6f}.
     *
     * <p>Ожидаемый результат: {@code 2} с переносом строки на консоли.</p>
     */
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MathPow.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "9.0" + ln
        ));
    }
}

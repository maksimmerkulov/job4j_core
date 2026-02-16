package ru.job4j.basics.branching;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link ShortCircuitAnd}.
 *
 * <p>Проверяется корректность работы
 * метода {@link ShortCircuitAnd#main(String[])}
 * при использовании оператора {@code &&}.</p>
 *
 * <p>Ожидается, что на консоль будет выведен только символ {@code A},
 * так как метод {@code showB()} не вызывается из-за короткого замыкания.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ShortCircuitAndTest {

    /**
     * Проверяет вывод программы {@link ShortCircuitAnd#main(String[])}.
     *
     * <p>Ожидаемый результат: вывод строки {@code A} и перевод строки.</p>
     */
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        ShortCircuitAnd.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "A" + ln
        ));
    }
}

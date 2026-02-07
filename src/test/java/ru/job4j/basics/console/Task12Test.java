package ru.job4j.basics.console;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Модульные тесты класса {@link Task12}.
 *
 * <p>Проверяется корректность вывода строк "Ping" и "Pong"
 * методом {@link Task12#main(String[])}.</p>
 *
 * <p>Ожидаемый результат формируется
 * с использованием {@link System#lineSeparator()} для независимости от ОС.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task12Test {

    /**
     * Проверяет метод {@link Task12#main(String[])}
     * при выводе строк "Ping" и "Pong" на консоль.
     *
     * <p>Ожидаемый результат: две строки с переводом строки после каждой.</p>
     */
    @Test
    public void whenMainThenOutPingPong() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task12.main(null);
        String expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator()
        ).add("Ping").add("Pong").toString();
        assertThat(out.toString(), is(expected));
    }
}

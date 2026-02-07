package ru.job4j.basics.console;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Print}.
 *
 * <p>Проверяется корректность вывода текста без перевода строки
 * методом {@link Print#main(String[])}.</p>
 *
 * <p>Результат сравнивается с ожидаемой строкой без переноса.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PrintTest {

    /**
     * Проверяет метод {@link Print#main(String[])}
     * при выводе строки "Сегодня я молодец!" на консоль.
     *
     * <p>Ожидаемый результат: строка без символа перевода строки.</p>
     */
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Print.main(null);
        assertThat(out.toString(), is("Сегодня я молодец!"));
    }
}

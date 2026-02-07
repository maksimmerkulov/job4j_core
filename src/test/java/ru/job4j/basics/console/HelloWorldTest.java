package ru.job4j.basics.console;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link ru.job4j.basics.console.HelloWorld}.
 *
 * <p>Проверяется корректность вывода текста на консоль
 * методом {@link ru.job4j.basics.console.HelloWorld#main(String[])}.</p>
 *
 * <p>Результаты сравниваются с ожидаемой строкой
 * с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class HelloWorldTest {

    /**
     * Проверяет метод {@link ru.job4j.basics.console.HelloWorld#main(String[])}
     * при выводе строки "Hello, Job4j!" на консоль.
     *
     * <p>Ожидаемый результат: корректная строка с переносом.</p>
     */
    @Test
    public void checkOutHelloJob4j() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        HelloWorld.main(null);
        assertThat(out.toString(), is("Hello, Job4j!"
                + System.lineSeparator()));
    }
}

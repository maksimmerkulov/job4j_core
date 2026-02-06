package ru.job4j.basics.scheme;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link HelloWorld}.
 *
 * <p>Проверяется корректность вывода текста на консоль
 * методом {@link HelloWorld#main(String[])}.</p>
 *
 * <p>Результаты сравниваются с ожидаемой строкой
 * с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.7
 */
public class HelloWorldTest {

    /**
     * Проверяет метод {@link HelloWorld#main(String[])}
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

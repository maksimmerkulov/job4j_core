package ru.job4j.basics.console;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Модульные тесты класса {@link Task18}.
 *
 * <p>Проверяется корректность вычислений и вывода периметра квадрата,
 * длины окружности и площади круга методом {@link Task18#main(String[])}.</p>
 *
 * <p>Результаты сравниваются с ожидаемыми значениями
 * с точностью до одного знака после запятой
 * и с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task18Test {

    /**
     * Проверяет метод {@link Task18#main(String[])} при вводе значений
     * стороны квадрата и радиуса круга.
     *
     * <p>Ожидаемый результат: корректный вывод периметра квадрата,
     * длины окружности и площади круга с учетом системного переноса строки.</p>
     */
    @Test
    public void checkOutHelloJob4j() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String input = String.format("%f %f", 33.3, 33.3);
        System.setIn(new ByteArrayInputStream(
                input.getBytes()
        ));
        System.setOut(new PrintStream(out));
        Task18.main(null);
        String expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator()
        )
                .add("133.2")
                .add("209.2")
                .add("3483.7")
                .toString();
        assertThat(out.toString(), is(expected));
    }
}

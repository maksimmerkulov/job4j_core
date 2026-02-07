package ru.job4j.basics.console;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Модульные тесты класса {@link Task15}.
 *
 * <p>Проверяется корректность вывода повторяющихся символов строки на консоль
 * методом {@link Task15#main(String[])}.</p>
 *
 * <p>Результаты сравниваются с ожидаемой строкой
 * с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task15Test {

    /**
     * Проверяет метод {@link Task15#main(String[])}
     * при выводе повторяющихся символов строки на консоль.
     *
     * <p>Ожидаемый результат: каждая последовательность одинаковых символов
     * выводится на отдельной строке.</p>
     */
    @Test
    public void eachSequenceOfSameSymbolsOnSeparateLine() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task15.main(null);
        String expected = String.format(
                "+++%s!!!!%s??",
                System.lineSeparator(),
                System.lineSeparator()
        );
        assertThat(out.toString(), is(expected));
    }
}

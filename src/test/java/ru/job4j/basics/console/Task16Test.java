package ru.job4j.basics.console;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Модульные тесты класса {@link Task16}.
 *
 * <p>Проверяется корректность вывода повторяющихся символов строки
 * без перехода на новую строку методом {@link Task16#main(String[])}.</p>
 *
 * <p>Результаты сравниваются с ожидаемой строкой "+++!!!!??".</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task16Test {

    /**
     * Проверяет метод {@link Task16#main(String[])}
     * при выводе повторяющихся символов строки без переноса.
     *
     * <p>Ожидаемый результат: строка "+++!!!!??".</p>
     */
    @Test
    public void eachSequenceOfSameSymbolsOnSeparateLine() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.main(null);
        assertThat(out.toString(), is("+++!!!!??"));
    }
}

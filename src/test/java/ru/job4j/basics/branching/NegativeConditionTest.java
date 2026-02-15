package ru.job4j.basics.branching;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты для класса {@link NegativeCondition}.
 *
 * <p>Проверяется корректность работы
 * метода {@link NegativeCondition#main(String[])}
 * для отрицательного и положительного числа.</p>
 *
 * <p>Результаты сравниваются с ожидаемым выводом на консоль:
 * {@code true} для отрицательного числа и {@code false} для положительного.</p>
 *
 * <p>Пример использования: создается поток вывода,
 * перенаправляется в него стандартный вывод, вызывается метод {@code main}
 * и сравнивается вывод с ожидаемым.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class NegativeConditionTest {

    /**
     * Проверяет метод {@link NegativeCondition#main(String[])}.
     *
     * <p>Ожидаемый результат: {@code true} для отрицательного числа
     * и {@code false} для положительного.</p>
     */
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        NegativeCondition.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "true" + ln + "false" + ln
        ));
    }
}

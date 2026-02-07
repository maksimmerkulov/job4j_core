package ru.job4j.basics.console;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Модульные тесты класса {@link Praise}.
 *
 * <p>Проверяется корректность вывода текста на консоль
 * методом {@link Praise#main(String[])}.</p>
 *
 * <p>Результаты сравниваются с ожидаемой строкой
 * с учетом системного переноса строки.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PraiseTest {

    /**
     * Проверяет метод {@link Praise#main(String[])}
     * при выводе строки "Сегодня я молодец!" на консоль.
     *
     * <p>Ожидаемый результат: корректная строка с переносом.</p>
     */
    @Test
    public void checkPraise() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Praise.main(null);
        assertThat(out.toString(), is("Сегодня я молодец!"
                + System.lineSeparator()));
    }
}

package ru.job4j.basics.console;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Модульные тесты класса {@link Task21}.
 *
 * <p>Проверяется корректность вывода полного имени пользователя
 * и номера телефона в рамке из символов {@code *}
 * методом {@link Task21#main(String[])}.</p>
 *
 * <p>Результаты сравниваются с ожидаемым оформлением рамки
 * и содержимым строк.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task21Test {

    /**
     * Проверяет метод {@link Task21#main(String[])}
     * на корректность отображения полного имени и номера телефона в рамке.
     *
     * <p>Ожидаемый результат: рамка из символов {@code *}
     * с полем полного имени и номера телефона, выровненных по ширине.</p>
     */
    @Test
    public void shouldOutputFullNameAndPhoneInFrame() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.main(null);
        String expected = "************************" + System.lineSeparator()
                + "* Фамилия Имя Отчество *" + System.lineSeparator()
                + "* +7(938) 123-45-67    *" + System.lineSeparator()
                + "************************";
        assertThat(out.toString(), is(expected));
    }
}

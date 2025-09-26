package ru.job4j.basics.console;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PraiseTest {
    @Test
    public void checkPraise() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Praise.main(null);
        assertThat(out.toString(), is("Сегодня я молодец!"
                + System.lineSeparator()));
    }
}

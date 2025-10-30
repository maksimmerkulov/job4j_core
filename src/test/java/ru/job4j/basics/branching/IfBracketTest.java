package ru.job4j.basics.branching;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IfBracketTest {
    @Test
    public void when2ThenAB() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IfBracket.show(2);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "A" + ln + "B" + ln
        ));
    }

    @Test
    public void when0ThenNoOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IfBracket.show(0);
        assertThat(out.toString(), is(""));
    }
}

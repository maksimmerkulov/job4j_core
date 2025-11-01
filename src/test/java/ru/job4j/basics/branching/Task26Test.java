package ru.job4j.basics.branching;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task26Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1And1ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.isEqual(1, 1);
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1And2ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.isEqual(1, 2);
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when0And0ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.isEqual(0, 0);
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus1AndMinus1ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.isEqual(-1, -1);
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenMinus1And1ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.isEqual(-1, 1);
        String expected = "Нет" + ln;
        assertThat(out.toString(), is(expected));
    }
}

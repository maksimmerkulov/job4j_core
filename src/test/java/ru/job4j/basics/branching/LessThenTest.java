package ru.job4j.basics.branching;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LessThenTest {
    @Test
    public void whenFirstLess() {
        assertThat(
                LessThen.check(1, 2),
                is(true)
        );
    }

    @Test
    public void whenFirstGreat() {
        assertThat(
                LessThen.check(10, 2),
                is(false)
        );
    }
}

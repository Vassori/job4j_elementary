package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas10Then9() {
        int[] data = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}
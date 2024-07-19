package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class RectangleAreaTest {

    @Test
    void whenP6K2Then2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double outRsl = RectangleArea.square(p, k);
        assertThat(outRsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP0K0Then0() {
        double p = 0;
        double k = 0;
        double expected = 0;
        double outRsl = RectangleArea.square(p, k);
        assertThat(outRsl).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP6K1Then2Dot25() {
        double p = 6;
        double k = 1;
        double expected = 2.25;
        double outRsl = RectangleArea.square(p, k);
        assertThat(outRsl).isEqualTo(expected, withPrecision(0.01));
    }
}
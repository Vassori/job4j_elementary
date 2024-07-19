package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    public void when0and0To2and0Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double outResult = Point.distance(x1, y1, x2, y2);
        assertThat(outResult).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenMinus2and0To2and0Then4() {
        int x1 = -2;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 4;
        double outResult = Point.distance(x1, y1, x2, y2);
        assertThat(outResult).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when2and2To2and2Then0() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 2;
        int y2 = 2;
        double expected = 0;
        double outResult = Point.distance(x1, y1, x2, y2);
        assertThat(outResult).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenMinus2and2To2andMinus2Then5Dot66() {
        int x1 = -2;
        int y1 = 2;
        int x2 = 2;
        int y2 = -2;
        double expected = 5.66;
        double outResult = Point.distance(x1, y1, x2, y2);
        assertThat(outResult).isEqualTo(expected, withPrecision(0.01));
    }
}
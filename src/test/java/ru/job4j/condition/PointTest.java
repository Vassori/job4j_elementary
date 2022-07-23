package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX10Y10X22Y20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double outResult = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, outResult, 0.01);
    }

    @Test
    public void whenX1Minus2Y10X22Y20Then4() {
        int x1 = -2;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 4;
        double outResult = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, outResult, 0.01);
    }

    @Test
    public void whenX12Y12X22Y22Then0() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 2;
        int y2 = 2;
        double expected = 0;
        double outResult = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, outResult, 0.01);
    }

    @Test
    public void whenX1Minus2Y12X22Y2Minus2Then5Dot66() {
        int x1 = -2;
        int y1 = 2;
        int x2 = 2;
        int y2 = -2;
        double expected = 5.66;
        double outResult = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, outResult, 0.01);
    }
}
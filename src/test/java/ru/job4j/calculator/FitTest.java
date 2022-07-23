package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenManHeight170Then80Dot5() {
        short height = 170;
        double expected = 80.5;
        double outRslMan = Fit.manWeight(height);
        Assert.assertEquals(expected, outRslMan, 0.01);
    }

    @Test
    public void whenWomanWeight170Then63Dot25() {
        short height = 165;
        double expected = 63.25;
        double outRslWoman = Fit.womanWeight(height);
        Assert.assertEquals(expected, outRslWoman, 0.01);
    }
}
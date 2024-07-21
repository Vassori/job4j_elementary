package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class FitTest {

    @Test
    public void whenManHeight170Then80Dot5() {
        int height = 170;
        double expected = 80.5;
        double resultMan = Fit.manWeight(height);
        assertThat(resultMan).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenWomanWeight170Then63Dot25() {
        int height = 165;
        double expected = 63.25;
        double resultWoman = Fit.womanWeight(height);
        assertThat(resultWoman).isEqualTo(expected, withPrecision(0.01));
    }
}
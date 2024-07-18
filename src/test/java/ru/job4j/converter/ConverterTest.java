package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float precision = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(precision));
    }

    @Test
    public void whenConvert270RblThen4dot5Dlr() {
        float in = 270;
        float expected = 4.5f;
        float out = Converter.rubleToDollar(in);
        float precision = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(precision));
    }
}
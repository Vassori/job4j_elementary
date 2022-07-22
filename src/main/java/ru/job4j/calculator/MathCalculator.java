package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDiv(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double sumMultiplySubDiv(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + subtraction(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета subAndDiv равен: " + subAndDiv(10, 20));
        System.out.println("Результат расчета sumMultiplySubDiv равен: " + sumMultiplySubDiv(10, 20));
    }
}

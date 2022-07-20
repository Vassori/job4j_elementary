package ru.job4j.calculator;

public class Math {
    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        int result1 = Math.func1(3);
        int result2 = Math.func2(5);
        int total = result1 + result2;
        System.out.println(total);
        int result3 = Math.func1(100);
    }
}

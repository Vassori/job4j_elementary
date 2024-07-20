package ru.job4j.calculator;

import java.util.Scanner;

public class Fit {
    public static double manWeight(int height) {
       return (height - 100) * 1.15;
    }

    public static double womanWeight(int height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите рост в сантиметрах ");
        int height = in.nextInt();
        in.close();

        double resultMan = Fit.manWeight(height);
        System.out.printf("Man %d cm is %.2f kg%n", height, resultMan);
        double resultWoman = Fit.womanWeight(height);
        System.out.printf("Woman %d cm is %.2f kg%n", height, resultWoman);
    }
}

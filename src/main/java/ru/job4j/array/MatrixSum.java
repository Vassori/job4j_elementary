package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rslSum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                rslSum += array[row][cell];
            }
        }
        return rslSum;
    }
}

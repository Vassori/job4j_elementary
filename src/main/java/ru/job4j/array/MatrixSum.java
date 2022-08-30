package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int cell : row) {
                sum += row[cell];
            }
        }
        return sum;
    }
}

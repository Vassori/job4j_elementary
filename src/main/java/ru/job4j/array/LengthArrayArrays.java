package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {1},
                {2, 2},
                {3, 3, 3},
                {4, 4, 4, 4}
        };
        for (int[] meaning : numbers) {
            System.out.println("Размер вложенного массива равен: " + meaning.length);
        }
    }
}

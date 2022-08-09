package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        for (boolean element : data) {
            if (element != result) {
                    return false;
            }
        }
        return true;
    }
}

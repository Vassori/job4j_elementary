package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                if (counter == 1) {
                    result += String.valueOf(symbol);
                    symbol = input.charAt(i);
                } else {
                    result += String.valueOf(symbol) + counter;
                    symbol = input.charAt(i);
                    counter = 1;
                }
            }
        }
        if (counter == 1) {
            result += String.valueOf(symbol);
        } else {
            result += String.valueOf(symbol) + counter;
        }
        return result;
    }
}

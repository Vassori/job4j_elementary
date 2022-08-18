package ru.job4j.array;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean isValid = !name.isEmpty() && !isDigit(name.codePointAt(0)) && !isUpperCase(name.codePointAt(0)) && name.codePointAt(0) != 95;
        for (int index = 1; index < name.length(); index++) {
            int code = name.codePointAt(index);
            if (!isSpecialSymbol(code) && !isUpperLatinLetter(code) && !isLowerLatinLetter(code) && !isDigit(code)) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code > 64 && code < 91;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code > 96 && code < 123;
    }
}

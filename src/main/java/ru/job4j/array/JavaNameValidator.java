package ru.job4j.array;

import static java.lang.Character.isDigit;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean isValid = (!name.isEmpty() && name.codePointAt(0) > 96 && name.codePointAt(0) < 123);
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

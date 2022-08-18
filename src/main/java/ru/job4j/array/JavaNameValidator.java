package ru.job4j.array;
public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean isValid = false;
        if (!name.isEmpty() && !Character.isDigit(name.charAt(0)) && !Character.isUpperCase(name.charAt(0)) && name.codePointAt(0) != 95) {
            for (int index = 0; index < name.length(); index++) {
                int code = name.codePointAt(index);
                if (isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code)) {
                    isValid = true;
                    break;
                }
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

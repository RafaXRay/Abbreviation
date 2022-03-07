package ru.Rudenko;

/**
 * Строка наоборот.
 * Напишите функцию, отображающую переданную строку задом наперёд. Напишите тесты.
 * 3 балла.
 */
public class StringReversed {
    public String getStringReversed (String input) {
        String revers = new StringBuffer(input).reverse().toString();

        return revers;
    }
}

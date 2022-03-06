package ru.Rudenko;

/**
 * Аббревиатура
 * Напишите функцию, создающую аббревиатуры. Например, на входе строка: "Санкт-Петербургский Государственный Технический
 * Институт им. Патриса Лумумбы". На выходе строка: СПБГТИПЛ.
 * 4 балла
 */
public class Abbreviation {
    public static String getAbbreviation(String value) {
        String result = "";
        char[] array = value.toCharArray();

        for(char x : array) {
            if (Character.isUpperCase(x)) {
                result += x;
            }
        }
        return result;
    }
}

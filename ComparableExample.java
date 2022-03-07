package ru.Rudenko;

import java.sql.Array;
import java.util.*;

/**
 * Компаратор.
 * Создать класс Person с полями: name, surname, age. Имплементировать интерфейс Comparable, используя поля surname и name.
 * Добавить несколько объектов Person в List. Использовать Comparator для различных типов сортировки.
 * Вывести:
 * 1) неотсортированный список,
 * 2) список, отсортированный по name,
 * 3) список, отсортированный по surname,
 * 4) список, отсортированный по age
 */
public class ComparableExample {
    public static void ComparableExample() {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Алексей", "Руденко", 40));
        personList.add(new Person("Елена", "Иванова", 21));
        personList.add(new Person("Владимир", "Петров", 48));
        personList.add(new Person("Иван", "Обрезов", 56));
        personList.add(new Person("Татьяна", "Ильина", 87));

        System.out.println("Неотсортированный список");
        printList(personList);

        System.out.println();
        System.out.println("Сортировка по age");
        Collections.sort(personList);
        printList(personList);

        System.out.println();
        System.out.println("Сортировка по name");
        Collections.sort(personList);
        printList(personList);

        System.out.println();
        System.out.println("Сортировка по surname");
        Collections.sort(personList);
        printList(personList);

    }

    private static void printList (List<Person> lstPerson) {
        for (Person p : lstPerson) {
            System.out.println(p.getName() + "\t" + p.getSurname() + "\t" + p.getAge());
        }
    }
}

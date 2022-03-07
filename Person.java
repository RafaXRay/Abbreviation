package ru.Rudenko;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    @Override
    public int compareTo(Person person) {
        int value = 0;

        // Сортировка по возрасту, по возрастанию
        if(this.age == person.age) {
            value = 0;
        }
        if(this.age > person.age) {
            value = 1;
        }
        if (this.age < person.age) {
            value = -1;
        }
        return value;
/*
        // Сортировка по name, по возрастанию
        value = this.name.compareTo(person.name);
        return value;

        // Сортировка по surname, по возрастанию
        value = this.surname.compareTo(person.surname);
        return value;

 */
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getName().equals(person.getName()) && getSurname().equals(person.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getAge());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

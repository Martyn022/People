package org.example;

import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = -1;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAddress() {
        return !(this.address == null);
    }
    public boolean hasAge() { return age != -1; }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return hasAge() ? OptionalInt.of(age) : OptionalInt.empty();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            this.age++;
        }
    }

    @Override
    public String toString() {
        return name + ' ' +
                surname +
                " (возраст: " + age + ')';
    }

    public PersonBuilder newChildBuilder() {
        var child = new PersonBuilder();
        child.setSurname(this.surname);
        child.setAge(2);
        child.setAddress(this.address);
        return child;
    }

}
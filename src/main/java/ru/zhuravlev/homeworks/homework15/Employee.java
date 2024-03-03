package ru.zhuravlev.homeworks.homework15;

import java.util.Objects;

public class Employee {
    private final String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Не удалось добавить сотрудника младше 18 лет");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package ru.zhuravlev.homeworks.homework17;

import java.util.Objects;

/**
 * Класс с личными данными сотрудника
 */
public class Person {
    private final String name;
    private Position position;
    private final Long id;
    private static Long count = 0L;

    public Person(String name, Position position) {
        this.name = name;
        this.position = position;
        this.id = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && position == person.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}

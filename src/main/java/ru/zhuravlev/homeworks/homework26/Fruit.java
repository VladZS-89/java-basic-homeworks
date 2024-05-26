package ru.zhuravlev.homeworks.homework26;

import java.util.Objects;

public class Fruit {
    private final String color;
    private final int weight;

    public Fruit(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(color, fruit.color) && Objects.equals(weight, fruit.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}

package ru.zhuravlev.homeworks.homework17;

public class MainApp {
    public static void main(String[] args) {
        Person person1 = new Person("fedor", Position.DIRECTOR);
        System.out.println(person1.getId());
        Person person2 = new Person("sergei", Position.DEVELOPER);
        System.out.println(person2.getId());
        Person person3 = new Person("sergei", Position.DEVELOPER);
        System.out.println(person3.getId());

    }
}

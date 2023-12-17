package ru.zhuravlev.homeworks.homework10;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        User[] users = {
                new User("Бойков", "Виктор", "Николаевич", 1989, "boykov89@mail.ru"),
                new User("Сидоров", "Сергей", "Анатольевич", 1955, "sidorov@mail.ru"),
                new User("Бойков", "Николай", "Петрович", 1965, "boykov65@mail.ru"),
                new User("Ковалёва", "Юлия", "Владимировна", 2001, "kovaleva@mail.ru"),
                new User("Бойкова", "Наталия", "Дмитриевна", 1969, "boykova69@mail.ru"),
                new User("Орлов", "Фёдор", "Степанович", 1995, "orlov@mail.ru"),
                new User("Афанасьев", "Павел", "Владимирович", 1990, "afanasev@mail.ru"),
                new User("Терёшин", "Алексей", "Григорьевич", 1980, "tereshin@mail.ru"),
                new User("Калашников", "Владимир", "Игоревич", 1975, "kalashnikov@mail.ru"),
                new User("Журавлев", "Владислав", "Сергеевич", 1989, "zhuravlev@mail.ru")
        };

        int yearsDelta = 40;
        int maxBirthYear = LocalDate.now().minusYears(yearsDelta).getYear();
        for (User user : users) {
            if (user.getYearOfBirth() < maxBirthYear) {
                user.info();
            }
        }

        Box someBox = new Box(20, 15, 10, "чёрный");
        someBox.info();
        someBox.putItem("книга");
        someBox.open();
        someBox.open();
        someBox.putItem("Книга");
        someBox.close();
        someBox.close();
        someBox.getItemOut();
        someBox.open();
        someBox.getItemOut();
        someBox.setColor("Белый");
        someBox.info();

        System.out.println();
        Box someBox2 = new Box(333, 222, 444, "BLACK");
        someBox2.info();
    }
}

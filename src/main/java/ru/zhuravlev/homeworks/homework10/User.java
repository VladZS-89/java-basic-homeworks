package ru.zhuravlev.homeworks.homework10;

public class User {
    private final String firstName;
    private final String lastName;
    private final String patronymic;
    private final int yearOfBirth;
    private String email;

    public User(String firstName, String lastName, String patronymic, int yearOfBirth, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void info() {
        System.out.println("ФИО: " + getLastName() + " " + getFirstName() + " " + getPatronymic()
                + "\nГод рождения: " + getYearOfBirth()
                + "\ne-mail: " + getEmail()
                + "\n===================================");
    }
}

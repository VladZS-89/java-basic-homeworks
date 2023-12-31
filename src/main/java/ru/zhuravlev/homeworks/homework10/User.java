package ru.zhuravlev.homeworks.homework10;

public class User {
    private final String lastName;
    private final String firstName;
    private final String patronymic;
    private final int yearOfBirth;
    private String email;

    public User(String lastName, String firstName, String patronymic, int yearOfBirth, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
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
        System.out.println("ФИО: " + lastName + " " + firstName + " " + patronymic
                + "\nГод рождения: " + yearOfBirth
                + "\ne-mail: " + email
                + "\n===================================");
    }
}

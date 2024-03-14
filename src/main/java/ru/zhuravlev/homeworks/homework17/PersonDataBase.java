package ru.zhuravlev.homeworks.homework17;

import java.util.List;

/**
 * Написать класс PersonDataBase, содержащий список Person, и имеющий следующие методы, со
 * следующей асимптотической сложностью (методы и конструктор класса Person реализовать
 * самостоятельно)
 *
 * ● Person findById(Long id) - найти Person по id - O(1)
 * ● void add(Person person) - добавитþ Person - O(1)
 * ● isManager(Person person) - O(1) - true если Position : MANAGER, DIRECTOR,
 * BRANCH_DIRECTOR или SENIOR_MANAGER
 * ● isEmployee(Long id) - O(1) - true если Employee имеет лĀбой другой Position
 */
public class PersonDataBase {
    private List<Person> personList;

    public Person findById(Long id) {
        return null;
    }

    public void add(Person person) {

    }

    public boolean isManager(Person person) {
        return true;
    }

    public boolean isEmployee(Long id) {
        return true;
    }
}

package ru.zhuravlev.homeworks.homework17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Написать класс PersonDataBase, содержащий список Person, и имеющий следующие методы, со
 * следующей асимптотической сложностью (методы и конструктор класса Person реализовать
 * самостоятельно)
 * ● Person findById(Long id) - найти Person по id - O(1)
 * ● void add(Person person) - добавитþ Person - O(1)
 * ● isManager(Person person) - O(1) - true если Position : MANAGER, DIRECTOR, BRANCH_DIRECTOR или SENIOR_MANAGER
 * ● isEmployee(Long id) - O(1) - true если Employee имеет любой другой Position
 */
public class PersonDataBase {
    private final Map<Long, Person> personList;
    private static final Set<Position> managerPositions = new HashSet<>();
    static {
        managerPositions.add(Position.MANAGER);
        managerPositions.add(Position.DIRECTOR);
        managerPositions.add(Position.BRANCH_DIRECTOR);
        managerPositions.add(Position.SENIOR_MANAGER);
    }

    public PersonDataBase() {
        personList = new HashMap<>();
    }

    public Person findById(Long id) {
        return personList.get(id);
    }

    public void add(Person person) {
        personList.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        return managerPositions.contains(personList.get(person.getId()).getPosition());
    }

    public boolean isEmployee(Long id) {
        return !managerPositions.contains(personList.get(id).getPosition());
    }
}

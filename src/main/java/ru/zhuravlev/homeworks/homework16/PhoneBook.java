package ru.zhuravlev.homeworks.homework16;

import java.util.*;

/**
 * Класс - телефонная книга
 */
public class PhoneBook {
    private final Map<String, Set<Long>> phoneMap;

    public PhoneBook() {
        this.phoneMap = new HashMap<>();
    }

    /**
     * Метод добавляет запись в телефонную книгу
     *
     * @param name        ФИО
     * @param phoneNumber номер телефона
     */
    public void add(String name, Long phoneNumber) {
        if (containsPhoneNumber(phoneNumber)) {
            System.out.println("Телефон " + phoneNumber + " уже есть в справочнике");
            return;
        }
        String formatName = name.replace(" ", "").toLowerCase();
        if (phoneMap.containsKey(formatName)) {
            phoneMap.get(formatName).add(phoneNumber);
            System.out.println("В телефонную книгу к контакту - " + name.trim() + " - добавили телефон: " + phoneNumber);
        } else {
            Set<Long> phoneNumbers = new HashSet<>();
            phoneNumbers.add(phoneNumber);
            phoneMap.put(formatName, phoneNumbers);
            System.out.println("В телефонную книгу добавили новую запись: " + name.trim() + " " + phoneNumber);
        }
    }

    /**
     * Метод находит номер(а) телефона по ФИО
     *
     * @param name ФИО
     */
    public Set<Long> find(String name) {
        return phoneMap.get(name.replace(" ", "").toLowerCase());
    }

    /**
     * Метод проверяет наличие телефона в телефонной книге
     *
     * @param phoneNumber номер телефона
     */
    public boolean containsPhoneNumber(Long phoneNumber) {
        for (Set<Long> value : phoneMap.values()) {
            if (value.contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(phoneMap, phoneBook.phoneMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneMap);
    }
}

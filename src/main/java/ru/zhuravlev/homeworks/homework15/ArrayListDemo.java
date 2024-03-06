package ru.zhuravlev.homeworks.homework15;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для теста свойств списка ArrayList
 */
public class ArrayListDemo {
    private static final int MIN_EMPLOYEE_AGE = 18;

    /**
     * Метод создаёт сортированный по возрастанию список чисел с шагом 1 в диапазоне заданных значений.
     *
     * @param min минимальное целое число диапазона
     * @param max максимальное целое число диапазона
     * @return сортированный по возрастанию список чисел с шагом 1
     */
    public static List<Integer> sort(int min, int max) {
        List<Integer> sortedIntList = new ArrayList<>();
        if (min > max) {
            return sort(max, min);
        }
        for (int i = min; i <= max; i++) {
            sortedIntList.add(i);
        }
        return sortedIntList;
    }

    /**
     * Метод суммирующий числа из списка, которые больше 5
     *
     * @param intList список целых чисел
     * @return сумма чисел из списка, которые больше 5
     */
    public static long sumListValuesIfMoreThenFive(List<Integer> intList) {
        long sum = 0;
        for (Integer i : intList) {
            if (i > 5) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Метод заменяет все элементы целочисленного массива на заданное целое число
     *
     * @param n       целое число
     * @param intList список целых чисел
     */
    public static void fillingArrayByNumber(int n, List<Integer> intList) {
        checkEmptyList(intList);
        System.out.print("Переданный список чисел: " + intList + "\nИзменённый список чисел: ");
        for (int i = 0; i < intList.size(); i++) {
            intList.set(i, n);
        }
        System.out.println(intList + "\n");
    }

    /**
     * Метод увеличивает каждый элемент целочисленного массива на заданное целое число
     *
     * @param n       целое число
     * @param intList список целых чисел
     */
    public static void increaseArrayValuesByNumber(int n, List<Integer> intList) {
        checkEmptyList(intList);
        System.out.print("Заданный массив: " + intList);
        for (int i = 0; i < intList.size(); i++) {
            intList.set(i, intList.get(i) + n);
        }
        System.out.println(". Увеличили каждый элемент на " + n + ". Получили: " + intList + "\n");
    }

    /**
     * Метод формирует список имён сотрудников
     *
     * @param employees список сотрудников
     * @return список имён сотрудников
     */
    public static List<String> getEmployeeNames(List<Employee> employees) {
        checkEmptyList(employees);
        List<String> nameList = new ArrayList<>();
        for (Employee employee : employees) {
            nameList.add(employee.getName());
        }
        return nameList;
    }

    /**
     * Метод возвращает список сотрудников, возраст которых >= заданному
     *
     * @param employees список сотрудников
     * @param minAge    минимальный возраст
     * @return список сотрудников не менее минимального возраста
     */
    public static List<Employee> getEmployeesFilteredByAge(List<Employee> employees, int minAge) {
        checkEmptyList(employees);
        if (minAge < MIN_EMPLOYEE_AGE) {
            throw new RuntimeException("Минимальный возраст сотрудника не может быть меньше 18 лет");
        }
        List<Employee> employeesFilteredByAge = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= minAge) {
                employeesFilteredByAge.add(employee);
            }
        }
        return employeesFilteredByAge;
    }

    /**
     * Метод проверяет не превышает ли средний возраст сотрудников указанный минимальный
     *
     * @param employees     список сотрудников
     * @param minAverageAge минимальный средний возраст сотрудников
     * @return true, если средний возраст сотрудников больше указанного; false, если - меньше
     */
    public static boolean isMoreAverageMinAge(List<Employee> employees, int minAverageAge) {
        checkEmptyList(employees);
        if (minAverageAge < MIN_EMPLOYEE_AGE) {
            throw new RuntimeException("Минимальный средний возраст сотрудников не может быть меньше 18 лет");
        }
        int sumAge = 0;
        for (Employee employee : employees) {
            sumAge += employee.getAge();
        }
        int averageAge = sumAge / employees.size();
        return averageAge > minAverageAge;
    }

    /**
     * Метод возвращает самого молодого сотрудника из списка
     *
     * @param employees список сотрудников
     * @return самый молодой сотрудник
     */
    public static Employee getYoungestEmployee(List<Employee> employees) {
        checkEmptyList(employees);
        Employee youngestEmployee = employees.get(0);
        for (int i = 1; i < employees.size(); i++) {
            if (employees.get(i).getAge() < youngestEmployee.getAge()) {
                youngestEmployee = employees.get(i);
            }
        }
        return youngestEmployee;
    }

    /**
     * Метод выкидывает RuntimeException, если передан пустой список
     *
     * @param list список
     */
    private static <T> void checkEmptyList(List<T> list) {
        if (list.isEmpty()) {
            throw new RuntimeException("В метод передан пустой список");
        }
    }
}

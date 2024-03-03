package ru.zhuravlev.homeworks.homework15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Класс для теста свойств списка ArrayList
 */
public class ArrayListDemo {
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
            int temp = min;
            min = max;
            max = temp;
        }
        for (int i = min; i < max; i++) {
            sortedIntList.add(i);
        }
        return sortedIntList;
    }

    /**
     * Метод суммирующий числа из списка, которые больше 5
     *
     * @param integerList список целых чисел
     * @return сумма чисел из списка, которые больше 5
     */
    public static long sumListValuesIfMoreThenFive(List<Integer> integerList) {
        System.out.print("Список целых чисел: " + integerList + "\nСумма чисел, которые больше 5 = ");
        long sum = 0;
        for (Integer i : integerList) {
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
        if (intList.isEmpty()) {
            System.out.println("Передан пустой список");
            return;
        }
        System.out.println(intList);
        for (int i = 0; i < intList.size(); i++) {
            intList.set(i, n);
        }
        System.out.println(intList);
    }

    /**
     * Метод увеличивает каждый элемент целочисленного массива на заданное целое число
     *
     * @param n       целое число
     * @param intList список целых чисел
     */
    public static void increaseArrayValuesByNumber(int n, List<Integer> intList) {
        System.out.print("Заданный массив: " + intList);
        if (!intList.isEmpty()) {
            for (int i = 0; i < intList.size(); i++) {
                intList.set(i, intList.get(i) + n);
            }
            System.out.println(". Увеличили каждый элемент на " + n + ". Получили: " + intList);
        } else {
            System.out.println("Передан пустой список");
        }
    }

    /**
     * Метод формирует список имён сотрудников
     *
     * @param employees список сотрудников
     * @return список имён сотрудников
     */
    public static List<String> getEmployeeNames(List<Employee> employees) {
        if (!employees.isEmpty()) {
            List<String> nameList = new ArrayList<>();
            for (Employee employee : employees) {
                nameList.add(employee.getName());
            }
            return nameList;
        } else {
            System.out.println("Список сотрудников пуст");
            return Collections.emptyList();
        }
    }

    /**
     * Метод возвращает список сотрудников, возраст которых >= заданному
     *
     * @param employees список сотрудников
     * @param minAge    минимальный возраст
     * @return список сотрудников не менее минимального возраста
     */
    public static List<Employee> getEmployeesFilteredByAge(List<Employee> employees, int minAge) {
        if (employees.isEmpty() || minAge < 0) {
            throw new RuntimeException("В метод getEmployeesFilteredByAge переданы некорректные параметры");
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
     * @param minAverageAge минимальный средний возраст
     * @return true, если средний возраст сотрудников больше указанного; false, если - меньше
     */
    public static boolean isMoreAverageMinAge(List<Employee> employees, int minAverageAge) {
        if (employees.isEmpty() || minAverageAge < 0) {
            throw new RuntimeException("В метод isMoreAverageMinAge переданы некорректные параметры");
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
        if (employees.isEmpty()) {
            throw new RuntimeException("В метод getYoungestEmployee переданы некорректные параметры");
        }
        Employee youngestEmployee = null;
        int minAge = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getAge() < minAge) {
                minAge = employee.getAge();
                youngestEmployee = employee;
            }
        }
        return youngestEmployee;
    }
}

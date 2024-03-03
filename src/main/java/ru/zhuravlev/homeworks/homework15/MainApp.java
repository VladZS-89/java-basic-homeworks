package ru.zhuravlev.homeworks.homework15;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(ArrayListDemo.sort(rndInt(20), rndInt(20)));
        System.out.println(ArrayListDemo.sumListValuesIfMoreThenFive(rndIntegers(10)));
        List<Integer> integerList = rndIntegers(10);
        ArrayListDemo.fillingArrayByNumber(5, integerList);
        ArrayListDemo.increaseArrayValuesByNumber(5, integerList);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Николай", 55));
        employeeList.add(new Employee("Людмила", 44));
        employeeList.add(new Employee("Виктор", 33));
        employeeList.add(new Employee("Александра", 22));

        System.out.println(ArrayListDemo.getEmployeeNames(employeeList));

        try {
            System.out.println(ArrayListDemo.getEmployeesFilteredByAge(employeeList, 33));
        } catch (RuntimeException e) {
            System.out.println(e);
        }

        int minAverageAge = 35;
        try {
            if (ArrayListDemo.isMoreAverageMinAge(employeeList, minAverageAge)) {
                System.out.println("Средний возраст сотрудников превышает " + minAverageAge + "!");
            } else {
                System.out.println("Средний возраст сотрудников меньше " + minAverageAge + "!");
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Самый молодой сотрудник - " + ArrayListDemo.getYoungestEmployee(employeeList));
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    private static int rndInt(int x) {
        return ((int) (Math.random() * x)) - (x / 2);
    }

    private static List<Integer> rndIntegers(int x) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            integers.add(rndInt(x * 10));
        }
        return integers;
    }
}

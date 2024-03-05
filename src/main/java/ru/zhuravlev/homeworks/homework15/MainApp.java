package ru.zhuravlev.homeworks.homework15;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // 1. Выводим список отсортированных чисел по возрастанию в указанном диапазоне с шагом - 1
        System.out.println("Отсортированный список числе по возрастанию с шагом 1: " +
                ArrayListDemo.sort(rndInt(20), rndInt(20)) + "\n"
        );

        List<Integer> integerList1 = rndIntegers(10);
        // 2. Выводим сумму элементов списка, значение которых больше 5
        System.out.println("Список целых чисел: " + integerList1 + " Сумма чисел, которые больше 5 = " +
                ArrayListDemo.sumListValuesIfMoreThenFive(integerList1)  + "\n"
        );

        List<Integer> integerList2 = rndIntegers(10);
        // 3. метод должен переписать каждую заполненную ячейку списка переданным в аргумент числом
        ArrayListDemo.fillingArrayByNumber(5, integerList2);

        List<Integer> integerList3 = rndIntegers(10);
        // 4. метод, увеличивающий каждый элемент списка на указанное число
        ArrayListDemo.increaseArrayValuesByNumber(5, integerList3);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Николай", 55));
        employeeList.add(new Employee("Людмила", 44));
        employeeList.add(new Employee("Виктор", 33));
        employeeList.add(new Employee("Александра", 22));

        // 5. метод, возвращающий список имен сотрудников
        System.out.println(ArrayListDemo.getEmployeeNames(employeeList) + "\n");

        // 6. метод, возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу
        try {
            System.out.println(ArrayListDemo.getEmployeesFilteredByAge(employeeList, 33) + "\n");
        } catch (RuntimeException e) {
            System.out.println(e + "\n");
        }

        // минимальный средний возраст списка сотрудников
        int minAverageAge = 35;
        // 7. метод, проверяющий, что средний возраст сотрудников превышает указанный аргумент
        try {
            if (ArrayListDemo.isMoreAverageMinAge(employeeList, minAverageAge)) {
                System.out.println("Средний возраст сотрудников превышает " + minAverageAge + "!\n");
            } else {
                System.out.println("Средний возраст сотрудников меньше " + minAverageAge + "!\n");
            }
        } catch (RuntimeException e) {
            System.out.println(e + "\n");
        }

        // 8. метод, возвращающий ссылку на самого молодого сотрудника
        try {
            System.out.println("Самый молодой сотрудник - " + ArrayListDemo.getYoungestEmployee(employeeList) + "\n");
        } catch (RuntimeException e) {
            System.out.println(e + "\n");
        }
    }

    // Метод возвращает случайное число с заданным аргументом диапазона
    private static int rndInt(int x) {
        return ((int) (Math.random() * x)) - (x / 2);
    }

    // Метод возвращает список размером Х со случайными числами
    private static List<Integer> rndIntegers(int x) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            integers.add(rndInt(x * 10));
        }
        return integers;
    }
}

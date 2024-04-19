package ru.zhuravlev.homeworks.homework17;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        PersonDataBase db = new PersonDataBase();
        Person person1 = new Person("Фёдор", Position.MANAGER);
        db.add(person1);
        db.add(new Person("Сергей", Position.DIRECTOR));
        db.add(new Person("Михаил", Position.DRIVER));
        db.add(new Person("Александр", Position.ENGINEER));
        db.add(new Person("Владимир", Position.SENIOR_MANAGER));
        db.add(new Person("Ольга", Position.DEVELOPER));
        db.add(new Person("Наталья", Position.QA));
        db.add(new Person("Светлана", Position.JANITOR));
        db.add(new Person("Виктория", Position.PLUMBER));
        db.add(new Person("Анатолий", Position.BRANCH_DIRECTOR));
        db.add(new Person("Оксана", Position.JUNIOR_DEVELOPER));

        System.out.println(db.findById(4L));
        System.out.println(db.isManager(person1) ? "Руководящая должность" : "Сотрудник");
        System.out.println(db.isEmployee(10L) ? "Руководящая должность" : "Сотрудник");
        System.out.println("======================");
        int[] array = {5, 10, 6, 3, 22, 15, 9};
        System.out.println(Arrays.toString(array));
        System.out.println("======bubbleSort=====");
        SorterForArray.bubbleSort(array);
        System.out.println("======quickSort**======"); //TODO доделать позже
//        SorterForArray.quickSort(array);
    }
}

package ru.zhuravlev.homeworks.homework14;

public class AppArrayDataException extends NumberFormatException {
    public AppArrayDataException() {
        super("Не удалось преобразовать в int элемент - ");
    }

    public void getMessage(String s) {
        System.out.println(s);
    }
}

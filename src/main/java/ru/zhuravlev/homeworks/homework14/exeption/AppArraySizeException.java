package ru.zhuravlev.homeworks.homework14.exeption;

public class AppArraySizeException extends ArrayIndexOutOfBoundsException {
    public AppArraySizeException() {
        super("Заданный массив не соответствует формату: 4х4");
    }
}

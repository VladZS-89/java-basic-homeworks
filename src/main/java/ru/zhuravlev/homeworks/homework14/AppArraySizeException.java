package ru.zhuravlev.homeworks.homework14;

public class AppArraySizeException extends ArrayIndexOutOfBoundsException {
    public AppArraySizeException() {
        super("Массив больше чем 4х4");
    }
}

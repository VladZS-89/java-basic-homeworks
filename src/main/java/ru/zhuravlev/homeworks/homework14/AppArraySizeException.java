package ru.zhuravlev.homeworks.homework14;

public class AppArraySizeException extends ArrayIndexOutOfBoundsException {
    public AppArraySizeException() {
        System.out.println("Exception - массив больше чем 4х4");;
    }
}

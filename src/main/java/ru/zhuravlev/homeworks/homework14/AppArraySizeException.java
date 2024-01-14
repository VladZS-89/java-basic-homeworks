package ru.zhuravlev.homeworks.homework14;

public class AppArraySizeException extends ArrayIndexOutOfBoundsException {
    public AppArraySizeException() {
    }

    public AppArraySizeException(String s) {
        super(s);
    }

    public AppArraySizeException(int index) {
        super(index);
    }
}

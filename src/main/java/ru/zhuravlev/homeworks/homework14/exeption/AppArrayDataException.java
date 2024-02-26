package ru.zhuravlev.homeworks.homework14.exeption;

public class AppArrayDataException extends NumberFormatException {
    public AppArrayDataException(int i, int j, String[][] strArr) {
        super("[" + i + "][" + j + "] " +
                "элемент массива со значением - " + strArr[i][j] +
                " - не удалось преобразовать в число ");
    }
}

package ru.zhuravlev.homeworks.homework14;

public class MainApp {
    public static void main(String[] args) {
        String[][] strings1 = {
                {"4", "6", "2", "7"},
                {"2", "3", "9", "5"},
                {"3", "8", "1", "6"},
                {"1", "2", "9", "8"}
        };

        String[][] strings2 = {
                {"40", "60", "20", "70"},
                {"20", "30", "90", "50"},
                {"30", "80", "10", "60"},
                {"10", "20", "90", "80", "100"}
        };

        String[][] strings3 = {
                {"4", "6", "2", "7"},
                {"2", "3", "9", "5q"},
                {"3", "8r", "1", "6"},
                {"1", "2", "9", "8m"}
        };

        convertToIntAndSumStringArray(strings1);
        convertToIntAndSumStringArray(strings2);
        convertToIntAndSumStringArray(strings3);
    }

    public static void convertToIntAndSumStringArray(String[][] strArr) {
        int sum = 0;
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                if (i > 3 || j > 3) {
                    throw new AppArraySizeException();
                }
                try {
                    sum += Integer.parseInt(strArr[i][j]);
                } catch (NumberFormatException exception) {
                    throw new AppArrayDataException(i, j, strArr);
                }
            }
        }
        System.out.println("Сумма элементов массива = " + sum);
    }
}

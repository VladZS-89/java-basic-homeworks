package ru.zhuravlev.homeworks.homework14;

public class MainApp {
    static String[][] strings1, strings2, strings3;

    static {
        strings1 = new String[][]{
                {"4", "6", "2", "7"},
                {"2", "3", "9", "5"},
                {"3", "8", "1", "6"},
                {"1", "2", "9", "8"}
        };
        strings2 = new String[][]{
                {"40", "60", "20", "70"},
                {"20", "30", "90", "50"},
                {"30", "80", "10", "60"},
                {"10", "20", "90", "80"}
        };
        strings3 = new String[][]{
                {"4", "6", "2", "7"},
                {"2", "3", "9", "EPIC FAIL"},
                {"3", "8", "1", "6"},
                {"1", "2", "9", "8"}
        };
    }

    public static void main(String[] args) {
        ArrayStringService.convertToIntAndSum(strings1);
        ArrayStringService.convertToIntAndSum(strings2);
        ArrayStringService.convertToIntAndSum(strings3);
    }
}

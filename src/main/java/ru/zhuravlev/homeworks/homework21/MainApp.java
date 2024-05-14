package ru.zhuravlev.homeworks.homework21;

public class MainApp {
    public static void main(String[] args) {
        double[] array1 = new double[100_000_000];
        real1(array1);
        System.out.println();
        double[] array2 = new double[100_000_000];
        real2(array2);
    }

    public static void real1(double[] array) {
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }

    public static void real2(double[] array) {
        long time1 = System.currentTimeMillis();
        Thread threadOne = new Thread(() -> {
            for (int i = 0; i < 25_000_000; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread threadTwo = new Thread(() -> {
            for (int i = 25_000_000; i < 50_000_000; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread threadThree = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 50_000_000; i < 75_000_000; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        Thread threadFour = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 75_000_000; i < array.length; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }
}

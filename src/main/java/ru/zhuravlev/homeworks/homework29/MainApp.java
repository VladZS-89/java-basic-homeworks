package ru.zhuravlev.homeworks.homework29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApp {
    private final Object monitor = new Object();
    private String symbol = "C";

    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            executorService.execute(() -> {
                new Thread(() -> mainApp.printA()).start();
                new Thread(() -> mainApp.printB()).start();
                new Thread(() -> mainApp.printC()).start();
            });
        }
        executorService.shutdown();
    }

    public void printA() {
        synchronized (monitor) {
            try {
                while (!symbol.equals("C")) {
                    monitor.wait();
                }
                symbol = "A";
                System.out.print(symbol);
                monitor.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (monitor) {
            try {
                while (!symbol.equals("A")) {
                    monitor.wait();
                }
                symbol = "B";
                System.out.print(symbol);
                monitor.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (monitor) {
            try {
                while (!symbol.equals("B")) {
                    monitor.wait();
                }
                symbol = "C";
                System.out.print(symbol);
                monitor.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

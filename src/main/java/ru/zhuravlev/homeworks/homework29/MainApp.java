package ru.zhuravlev.homeworks.homework29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainApp {
    private final Object monitor = new Object();
    private String symbol = "C";

    public static void main(String[] args) throws InterruptedException {
        MainApp mainApp = new MainApp();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(mainApp::printA);
        executorService.execute(mainApp::printB);
        executorService.execute(mainApp::printC);
        // без метода awaitTermination первым завершится поток метода main методом shutdown,
        // но остальное потоки доработают и распечатают ABC...
        executorService.awaitTermination(30000, TimeUnit.MILLISECONDS);
        executorService.shutdown();
    }

    public void printA() {
        for (int i = 0; i < 5; i++) {

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
    }

    public void printB() {
        for (int i = 0; i < 5; i++) {
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
    }

    public void printC() {
        for (int i = 0; i < 5; i++) {
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
}

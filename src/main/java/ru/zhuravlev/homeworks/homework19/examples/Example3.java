package ru.zhuravlev.homeworks.homework19.examples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("src/main/resources/homework19/IOExample.txt"))) {
            int n = bis.read();
            while (n != -1) {
                System.out.print((char) n);
                n = bis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

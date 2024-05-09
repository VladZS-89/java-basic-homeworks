package ru.zhuravlev.homeworks.homework19.examples;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Example7 {
    public static void main(String[] args) {
        String data = "Example7 test";
        try (BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("src/main/resources/homework19/IOExample4.txt"))) {
            byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < bytes.length; i++) {
                bos.write(bytes[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

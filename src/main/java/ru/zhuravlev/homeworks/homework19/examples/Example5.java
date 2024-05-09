package ru.zhuravlev.homeworks.homework19.examples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Example5 {
    public static void main(String[] args) {
        String data = "Example5 test";
        try (FileOutputStream fos = new FileOutputStream("src/main/resources/IOExample2.txt")) {
            byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < bytes.length; i++) {
                fos.write(bytes[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package ru.zhuravlev.homeworks.homework20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerCalculator {
    private Socket clientSocket;
    private ServerSocket serverSocket;
    private DataInputStream input;
    private DataOutputStream output;

    public void start(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Сервер запущен.");
            while (true) {
                clientSocket = serverSocket.accept();
                input = new DataInputStream(clientSocket.getInputStream());
                output = new DataOutputStream(clientSocket.getOutputStream());
                output.writeUTF("Калькулятор может выполнить операции:\nсложение +\nвычитание -\nумножение *\nделение /\n");
                output.flush();
                while (true) {
                    String msg = input.readUTF();
                    String[] parsing = msg.split(" ");
                    int num1 = Integer.parseInt(parsing[0]);
                    String operation = parsing[1];
                    int num2 = Integer.parseInt(parsing[2]);
                    switch (operation) {
                        case "+" -> output.writeUTF(num1 + num2 + "");
                        case "-" -> output.writeUTF(num1 - num2 + "");
                        case "*" -> output.writeUTF(num1 * num2 + "");
                        case "/" -> output.writeUTF(num1 / num2 + "");
                        default -> output.writeUTF("нет такой операции");
                    }
                    output.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        try {
            input.close();
            output.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ServerCalculator serverCalculator = new ServerCalculator();
        serverCalculator.start(8080);
    }
}

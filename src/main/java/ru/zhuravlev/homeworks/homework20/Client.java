package ru.zhuravlev.homeworks.homework20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private Socket clientSocket;
    private DataInputStream input;
    private DataOutputStream output;

    public void startConnection(String host, int port) {
        Scanner scanner = new Scanner(System.in);
        try {
            clientSocket = new Socket(host, port);
            System.out.println("Подключились к серверу");
            input = new DataInputStream(clientSocket.getInputStream());
            output = new DataOutputStream(clientSocket.getOutputStream());
            System.out.println(input.readUTF());
            while (true) {
                System.out.println("Введите выражение: число операция число\nДля выхода: exit");
                String msg = scanner.nextLine();
                if (msg.equals("exit")) break;
                output.writeUTF(msg);
                output.flush();
                System.out.println("Результат: " + input.readUTF());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stopConnection() throws IOException {
        input.close();
        output.close();
        clientSocket.close();
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.startConnection("localhost", 8080);
    }
}

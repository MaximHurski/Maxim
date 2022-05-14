package com.company.Lessons.les24enum.task3exception;

import java.util.Scanner;

//login - латиницей
//password - от 6 до 20 цифр
//ввод пароля 2 раза для подтверждения
public class Main {
    public static void main(String[] args) {
       User user = new User();

        String login, password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login");
        login = scanner.next();
        System.out.println("Enter password");
        password = scanner.next();

        user.registration(login, password);

    }
}

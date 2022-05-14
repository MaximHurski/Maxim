package com.company.Lessons.les24enum.task2exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        try {
            int b = 5 / a;
        } catch (ArithmeticException arithmeticException) {
            while (a == 0) {
                System.out.println("enter number again");
                a = scanner.nextInt();
            }
        } finally {
            System.out.println(5/a);
        }

    }
}

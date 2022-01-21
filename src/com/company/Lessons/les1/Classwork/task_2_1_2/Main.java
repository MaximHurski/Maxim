package com.company.Lessons.les1.Classwork.task_2_1_2;

import java.util.Scanner;
// Пользователь вводит 3 числа. Найти максимальное и вывести его.
// Решить используя логические операции
//+
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scan.nextDouble();
        System.out.println("Enter third number: ");
        double num3 = scan.nextDouble();

        if (num1 > num2 & num1 > num3) {
            System.out.println("Biggest number is " + num1);
        } else if (num2 > num3) {
            System.out.println("Biggest number is " + num2);
        } else {
            System.out.println("Biggest number is " + num3);
        }
    }
}

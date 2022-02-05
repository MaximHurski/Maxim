package com.company.Lessons.les6;

import java.util.Scanner;
//Написать программу, которая проверяет, является ли число кубом (8=2^3)
public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer number: ");
        int num = scanner.nextInt();
        int d = (int)Math.cbrt(num);
        double x = Math.pow(d, 3);
        if (x == num) {
            System.out.println("is cubic number");
        }
        else {
            System.out.println("not a cubic number");
        }
    }
}
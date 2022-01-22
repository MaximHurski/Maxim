package com.company.Lessons.les4.Homework;
import java.util.Scanner;

//Составьте программу, вычисляющую A*B, не пользуясь операцией умножения

public class Task_4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        //naming could be better
        int num1 = scan.nextInt();
        System.out.println("Enter second number:");
        int num2 = scan.nextInt();
        int sum = 0;
        //or i<num1
        for (int i = 0; i != num1; i++ ) {
            //sum+=num2
            sum+=num2;
        }
        System.out.println("Multiplication number1 and number2 is = " + sum);
        }
    }


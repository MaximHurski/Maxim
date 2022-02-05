package com.company.Lessons.les8;

import java.util.Scanner;

//Есть массив чисел. Вводим число. Определить есть ли это число в массиве. Решить используя while
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input lenth of massiv: ");
        int lenth = scanner.nextInt();

        int[] anArray = new int[lenth];

        for (int i = 0; i < lenth; i++) {
            System.out.println("Input number: ");
            anArray[i] = scanner.nextInt();
        }
        System.out.println("Input 1 number: ");
        int number = scanner.nextInt();
        int j = 0;
        while (j<lenth) {
            if (number == anArray[j]) ;
            System.out.print(" " + anArray[j]);
            break;
        }
            j++;
        }
    }

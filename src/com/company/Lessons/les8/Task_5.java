package com.company.Lessons.les8;

import java.util.Scanner;

//Есть массив чисел. Вводим число. Определить есть ли это число в массиве. Решить используя while
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] anArray = {1, 2, 3, 6, 8, 4, 45, 12, 46, 7, 20};
        int i = 0;
        System.out.println("Введи число которое сравним с массивом");
        int userIn = scanner.nextInt();
        do {
            if (userIn == anArray[i]) {
                System.out.println("В массиве есть число " + anArray[i]);
                break;
            }
            if(i==anArray.length-1) {
                System.out.println("В массиве нет числа " + userIn);
            }
            i++;
        } while (i < anArray.length);
        }
    }

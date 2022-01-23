package com.company.Lessons.les5.Homework;

public class Task_5_3 {
    // Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99

    public static void main(String[] args) {

        int i = 0;
        int sum = 0;
        final int max = 99;
        while (i <= max) {
            i++;
            {
                if (i % 2 == 0)
                    continue;
                sum += i;
                System.out.print(i + " ");
            }
        }System.out.print("\n");
        System.out.print("Sum of odd numbers = "+ sum);
    }
}


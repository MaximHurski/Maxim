package com.company.Lessons.les1.Classwork.task_2_3;
import java.util.Scanner;
// Пользователь вводит число. Отображаем название дня недели, иначе, что такого дня нет.

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of the day:");
        int num1 = scan.nextInt();

        if (num1 == 1) {
            System.out.println("Your day is Monday");
        } else if (num1 == 2) {
            System.out.println("Your day is Tuesday");
        } else if (num1 == 3) {
            System.out.println("Your day is Wednesday");
        } else if (num1 == 4) {
            System.out.println("Your day is Thursday");
        } else if (num1 == 5) {
            System.out.println("Your day is Friday");
        } else if (num1 == 6) {
            System.out.println("Your day is Saturday");
        } else if (num1 == 7) {
            System.out.println("Your day is Sunday");
        } else {
            System.out.println("Sorry, enter number 1-7");
        }
    }
}
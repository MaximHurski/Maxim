package com.company.Lessons.les1.Classwork.task_2_3;
import java.util.Scanner;
// Пользователь вводит число. Отображаем название дня недели, иначе, что такого дня нет.
//+, but think of better naming: num1 does not tell me anything
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of the day:");
        int day = scan.nextInt();

        if (day == 1) {
            System.out.println("Your day is Monday");
        } else if (day == 2) {
            System.out.println("Your day is Tuesday");
        } else if (day == 3) {
            System.out.println("Your day is Wednesday");
        } else if (day == 4) {
            System.out.println("Your day is Thursday");
        } else if (day == 5) {
            System.out.println("Your day is Friday");
        } else if (day == 6) {
            System.out.println("Your day is Saturday");
        } else if (day == 7) {
            System.out.println("Your day is Sunday");
        } else {
            System.out.println("Sorry, enter number 1-7");
        }
    }
}

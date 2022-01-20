package com.company.Lessons.les1.Classwork.task_3_1;
import java.util.Scanner;
//Пользователь вводит число. Отображаем название дня недели,
//иначе, что такого дня нет (т.е переписать 2.3 с другой конструкцией)
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of the day:");
        int num1 = scan.nextInt();

        switch (num1) {
            case 1:
                System.out.println("Your day is Monday");
                break;
            case 2:
                System.out.println("Your day is Tuesday");
                break;
            case 3:
                System.out.println("Your day is Wednesday");
                break;
            case 4:
                System.out.println("Your day is Thursday");
                break;
            case 5:
                System.out.println("Your day is Friday");
                break;
            case 6:
                System.out.println("Your day is Saturday");
                break;
            case 7:
                System.out.println("Your day is Sunday");
                break;
            default:
                System.out.println("Sorry, enter number 1-7");
        }
    }
}
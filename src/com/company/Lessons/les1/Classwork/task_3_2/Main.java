package com.company.Lessons.les1.Classwork.task_3_2;
import java.util.Scanner;
//Пользователь вводит месяц в виде числа от 1 до 12
//Определите в какую пору года попадает этот месяц (зима, лето, весна, осень).
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of the month:");
        int num1 = scan.nextInt();

        switch (num1) {
            case 1:
                System.out.println("Your season is winter");
                break;
            case 2:
                System.out.println("Your season is winter");
                break;
            case 3:
                System.out.println("Your season is spring");
                break;
            case 4:
                System.out.println("Your season is spring");
                break;
            case 5:
                System.out.println("Your season is spring");
                break;
            case 6:
                System.out.println("Your season is summer");
                break;
            case 7:
                System.out.println("Your season is summer");
                break;
            case 8:
                System.out.println("Your season is summer");
                break;
            case 9:
                System.out.println("Your season is autumn");
                break;
            case 10:
                System.out.println("Your season is autumn");
                break;
            case 11:
                System.out.println("Your season is autumn");
                break;
            case 12:
                System.out.println("Your season is winter");
                break;

            default:
                System.out.println("Sorry, enter number 1-12");
        }
    }
}
package com.company.Lessons.les1.Classwork.task_3_2;
import java.util.Scanner;
//Пользователь вводит месяц в виде числа от 1 до 12
//Определите в какую пору года попадает этот месяц (зима, лето, весна, осень).
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of the month:");
        //naming
        int month = scan.nextInt();
//do you remember what can we write to combine several cases? (case1:case2:System.out.println("Your season is winter");break;.......) Your code is redundant
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Your season is winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Your season is spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Your season is summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Your season is autumn");
                break;

            default:
                System.out.println("Sorry, enter number 1-12");
        }
    }
}

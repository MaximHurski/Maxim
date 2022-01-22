package com.company.Lessons.les1.Classwork.task_2_2;
import java.util.Scanner;
//Пользователь вводит 2 числа. Проверить кратное ли первое второму

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scan.nextDouble();
        double res = num1 % num2;
//ok, but you could place 13 line in 15 :)
        if( res == 0 ) {
            System.out.println("first number multiple second number");
        } else {
            System.out.println("first number is not multiple second number");
        }
        System.out.println("sorry for my english ;)");
    }
}


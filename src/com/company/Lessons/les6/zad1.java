package com.company.Lessons.les6;

import java.util.Scanner;

//Калькулятор. Пользователь вводит 2 числа.
//После выполнения операций спросить, хочет ли продолжить, если да – заново, иначе завершаем программу
public class zad1 {
    public static void main(String[] args) {
        boolean continueCalculation = true;

        Scanner scan = new Scanner(System.in);
        while (continueCalculation == true) {

            System.out.println("Enter first number:");
            double num1 = scan.nextDouble();
            System.out.println("Enter second number:");
            double num2 = scan.nextDouble();
            double result = 0;

            System.out.println("Enter action:");
            System.out.println("'+' - Sum");
            System.out.println("'/' - Division");
            System.out.println("'-' - Difference");
            System.out.println("'*' - Multiplication");
            String action = scan.nextLine();
            action = scan.nextLine();

            switch (action) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0)
                        System.out.println("Error");
                    else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Sorry, something wrong");
            }
            System.out.println("Your result is: " + result);
            System.out.println("Do you want to continue? Answer with either Yes or No   ");
            String continueInput = scan.nextLine();
            if (continueInput.equals("No"))
            {
                continueCalculation = false;
            }
        }
    }
}
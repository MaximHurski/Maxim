package com.company.Lessons.les1.Classwork.task_4_2;
import java.util.Scanner;   
//Калькулятор.
//Вместо того, чтобы выбирать операцию по числу (1 – sum, 2 – division и тп), используем символы
//same comments as task_4_1
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scan.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scan.nextDouble();
        double result;

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
                System.out.println("Your result is: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Your result is: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Your result is: " + result);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Error");
                else {
                    result = num1 / num2;
                    System.out.println("Your result is: " + result);
                }
                break;
                default:
                System.out.println("Sorry, something wrong");
        }
    }
}


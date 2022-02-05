package com.company.Lessons.les6;
import java.util.Scanner;
import java.util.Random;
//Вводим число. Программа генерирует рандомное число.
//Определяем равно (больше, меньше) ли введенное число сгенерированному

public class Randik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number from 0 to 99:");
        int num = scan.nextInt();

        Random rand = new Random();
        int num2 = rand.nextInt(100);
        System.out.println("Random number is " + num2);

        if (num == num2) {
            System.out.println("You are a lucky son of a bitch!!!!");
        } else if (num < num2) {
            System.out.println("Your number less than random");
        } else {
            System.out.println("Your number more than random");
        }
    }
}
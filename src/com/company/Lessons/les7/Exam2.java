package com.company.Lessons.les7;

import java.util.Scanner;
//What did I say about doing all this operations in 1 loop?

public class Exam2 {

        //	Посчитать сумму четных, нечетных и всех чисел
        public static void main(String[] args) {

            int i = 0;
            int sumEven = 0;
            int sumOdd = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter max number:");
            double max = scan.nextDouble();

            while (i <= max) {
                    if (i % 2 == 0) {
                        sumEven += i;
                    } else {
                        sumOdd += i;
                }
                i++;
            }
            System.out.println("Sum of even numbers = " + sumEven);
            System.out.println("Sum of odd numbers = " + sumOdd);
            System.out.println("Sum of all numbers= " + (sumEven + sumOdd));
        }
    }



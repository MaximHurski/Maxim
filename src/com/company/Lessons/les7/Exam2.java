package com.company.Lessons.les7;

import java.util.Scanner;

public class Exam2 {

        //	Посчитать сумму четных, нечетных и всех чисел
        public static void main(String[] args) {

            int i = 0;
            int sumEven = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter max number:");
            double max = scan.nextDouble();

            while (i < max) {
                i++;
                {
                    if (i % 2 != 0)
                        continue;
                    sumEven += i;
                    System.out.print(i + " ");
                }
            }
            System.out.print("\n");
            System.out.println("Sum of even numbers = " + sumEven);


            int j = 0;
            int sumAll;
            int sumOdd = 0;
            while (j < max) {
                j++;
                {
                    if (j % 2 == 0)
                        continue;
                    sumOdd += j;
                    System.out.print(j + " ");
                }
            }
            System.out.print("\n");
            System.out.println("Sum of odd numbers = " + sumOdd);
            sumAll = sumEven + sumOdd;
            System.out.println("Sum of all numbers= " + sumAll);
        }
    }



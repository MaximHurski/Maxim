package com.company.Lessons.les5.Homework;

public class Task_5_4 {
    //Даны числа от 0 до 100.
    // - Посчитать сумму четных и вывести на экран
    // - Посчитать сумму нечетных и вывести на экран
    // - Найти общую сумму всех чисел
    public static void main(String[] args) {

        int i = 1;
        int sumEven = 0;
        final int max = 99;
        while (i <= max) {
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
        while(j <=max)
    {
        j++;
        {
            if (j % 2 == 0)
                continue;
            sumOdd += j;
            System.out.print(j + " ");
        }
    }   System.out.print("\n");
        System.out.println("Sum of odd numbers = "+sumOdd);
        sumAll = sumEven + sumOdd;
        System.out.println("Sum of all numbers= "+sumAll);
    }
}




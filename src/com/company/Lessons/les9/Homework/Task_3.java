package com.company.Lessons.les9.Homework;

import java.util.Random;
import java.util.Scanner;

//Есть матрица. Посчитать сумму элементов в каждой строке
public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = scan.nextInt();
        Random random = new Random();
        int[][] twoDimArray = new int[size][size];
        for (int i = 0; i < twoDimArray.length; i++) {
            int sum = 0;
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = random.nextInt(size);
                System.out.print(twoDimArray[i][j] + "\t");
                sum += twoDimArray[i][j];
            }
            System.out.println();
            System.out.println("Line sum = " + sum);
        }
    }
}



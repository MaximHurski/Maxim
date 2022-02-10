package com.company.Lessons.les9.Homework;

import java.util.Random;
import java.util.Scanner;

//Есть матрица (квадратная). Посчитать сумму элементов, расположенных на главной диагонали:
public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = scan.nextInt();
        Random random = new Random();
        int sumDiag = 0;
        int diagonal = 0;
        int[][] twoDimArray = new int[size][size];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = random.nextInt(size);
                System.out.print(twoDimArray[i][j] + "\t");
            }
            sumDiag += twoDimArray[diagonal][diagonal];
            diagonal ++;
            System.out.println();
        }
        System.out.println("Sum of main diagonal = " + sumDiag);
    }
}


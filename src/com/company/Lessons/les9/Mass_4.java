package com.company.Lessons.les9;
//Пользователь вводим размерноесть 2мерного массива(квадратныйб т.е. число строк=числу столбцов)
//и заполняет через сканер

import java.util.Scanner;

public class Mass_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = scan.nextInt();
        int[][] twoDimArray = new int[size][size];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.println("Enter array element [" + i + "][" + j + "]:");
                twoDimArray[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
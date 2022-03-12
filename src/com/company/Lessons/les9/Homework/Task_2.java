package com.company.Lessons.les9.Homework;
//Есть матрица. Найти в ней введенное пользователем число и вывести номер столбца и строки
//+
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        int[][] directInit = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {2, 4, 8, 9}, {1, 3, 6, 8}};
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number 1-12: ");
        int num = scan.nextInt();
        for (int i = 0; i < directInit.length; i++) {
            for (int j = 0; j < directInit[i].length; j++) {
                if (directInit[i][j] == num) {
                    System.out.print("Row/column - [" + i + "][" + j + "]  ");
                }
            }
        }
    }
}

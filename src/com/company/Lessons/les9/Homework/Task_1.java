package com.company.Lessons.les9.Homework;
import java.util.Scanner;
//Вывести таблицу умножения используя двумерный массив
public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input maximum size of multiplication table: ");
        int size = scan.nextInt();
        int[][] multiplTable = new int[size+1][size+1];
        for (int row = 1; row < multiplTable.length; row++) {
            for (int column = 1; column < multiplTable[row].length; column++) {
                System.out.print(multiplTable[row][column] = (row) * (column));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


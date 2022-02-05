package com.company.Lessons.les8;

import java.util.Scanner;
//ввести размер массива и числа из которых он состоит
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input lenth of massiv: ");
        int lenth = scanner.nextInt();

        int[] anArray = new int[lenth];

        for (int i = 0; i < lenth; i++) {
            System.out.println("Input number: ");
            anArray[i] = scanner.nextInt();
        }
        int j = 0;
        while (j<lenth) {
            System.out.print(" " + anArray[j]);
            j++;
        }
    }
}

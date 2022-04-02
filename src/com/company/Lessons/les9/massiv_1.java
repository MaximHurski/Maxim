package com.company.Lessons.les9;

import java.util.Scanner;

//ввести массив из строк с помощью сканера
public class massiv_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = scan.nextInt();
        String[] anArray = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Input string [" + i + "]: ");
            anArray[i] = scan.next();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(anArray[i]);
        }
    }
}

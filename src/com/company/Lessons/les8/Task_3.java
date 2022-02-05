package com.company.Lessons.les8;

import java.util.Scanner;

//ввести размер массива и числа из которых он состоит + посчитать среднее арифметическое
public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input lenth of massiv: ");
        int lenth = scanner.nextInt();

        double[] anArray = new double[lenth];
        double sum = 0;

        for (int i = 0; i < lenth; i++) {
            System.out.println("Input number: ");
            anArray[i] = scanner.nextDouble();
            sum += anArray[i];
        }
        int j = 0;
        while (j < lenth) {
            System.out.println(" " + anArray[j]);
            j++;
        }
        System.out.printf("%.2f", sum / lenth);  //"%.2f" сколько символов выводить после запятой
    }
}
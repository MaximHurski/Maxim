package com.company.Lessons.les8.Homework;

import java.util.Arrays;

// Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого
public class Task_2 {
    public static void main(String[] args) {
        int[] anArray1 = {13, 44, 2, 45, 87, 23, 222, 33, 24, 35, 5, 6, 7, 8, 88, 111, 102};
        //BIG LETTER? Don't scare me:)
        int MaxEven = 0;
        for (int i = 0; i < anArray1.length; i++) {
            if (anArray1[i] % 2 == 0) {
                MaxEven++;
            }
        }
        //nice
        System.out.println(Arrays.toString(anArray1));
        int[] anArray2 = new int[MaxEven];
        //BIG LETTER???
        int Even = 0;
        for (int i = 0; i < anArray1.length; i++) {
            if (anArray1[i] % 2 == 0) {
                anArray2[Even] = anArray1[i];
                Even++;
            }
        }
        System.out.println(Arrays.toString(anArray2));
    }
}

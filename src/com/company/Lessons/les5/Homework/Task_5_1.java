package com.company.Lessons.les5.Homework;

// Вычислить: 1+2+4+8+...+256

public class Task_5_1 {
    public static void main(String[] args) {

            final int max = 256;
            int sum = 1;
            int i = 1;
        while (i < max) {
            i= i*2;
            sum += i;
        }
        System.out.println("Sum of all numbers= " + sum);
    }
}

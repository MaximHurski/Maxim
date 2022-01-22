package com.company.Lessons.les4.Homework;

//нарисовать оставшиеся 2 треугольника
//+
public class Task_4_6 {
    public static void main(String[] args) {

        for (int i = 4; i >= 0; i--) {
            for (int j = i; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}


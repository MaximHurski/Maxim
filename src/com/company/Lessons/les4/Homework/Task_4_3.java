package com.company.Lessons.les4.Homework;

//Напишите программу печати таблицы перевода расстояний из дюймов
//в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

public class Task_4_3 {
    public static void main(String[] args) {
//20, 2.54 are magic numbers, use const
        double inch = 2.54;
        for (int i = 1; i <= 20; i++) {
            System.out.println (i + " inch = " + inch*i + " cm");
        }
    }
}


package com.company.Lessons.les4.Homework;

//Одноклеточная амеба каждые 3 часа делится на 2 клетки.
//Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

public class Task_4_1 {
    public static void main(String[] args) {
        int amoeb = 1;
//24 - magic number, use const.
        for (int i = 3; i <= 24; i = i + 3) {
            amoeb = amoeb*2;

            System.out.println("Day " + i + " we have- " + amoeb + " amoebas");


            }
        }
    }

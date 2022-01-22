package com.company.Lessons.les4.Homework;

//Начав тренировки, спортсмен в первый день пробежал 10 км.
//Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
//Какой суммарный путь пробежит спортсмен за 7 дней?

public class Task_4_4 {
    public static void main(String[] args) {
        double sum = 10;     //Итоговый пробег (в первый день 10км)
        double n = 10;       // % увеличения нормы
        for (double i = 1; i < 7; i++) {
            n = n * 1.1;
            sum += n;
        }
        System.out.println("Summary run " + sum + " Km");
    }
}


package com.company.Lessons.les8.Homework;

// Есть массив слов. Нужно инвертировать его порядок.
public class Task_1 {
    public static void main(String[] args) {
        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        for (int i = 3; i >= 0; i--) {
            System.out.println(seasons[i]);
        }
    }
}

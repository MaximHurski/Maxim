package com.company.Lessons.les8.Homework;

// Есть массив слов. Нужно инвертировать его порядок.
public class Task_1 {
    public static void main(String[] args) {
        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        //as one of the possible solutions, ok
        for (int i = seasons.length - 1; i >= 0; i--) {
            System.out.println(seasons[i]);
        }
    }
}
//for (int i = 0; i < array.lenth; i++){
//  array[i] = array.lenth - 1 - i;
//          }
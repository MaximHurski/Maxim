package com.company.Lessons.les8;

// есть массив чисел. заменить каждый нечетный элемент на 0
public class Task_4 {
    public static void main(String[] args) {
        int[] anArray = {13, 33, 22, 35, 5, 6, 7};
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] % 2 != 0) {
                anArray[i] = 0;
            }
            System.out.println(anArray[i]);
        }
    }
}

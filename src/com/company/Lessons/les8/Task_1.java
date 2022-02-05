package com.company.Lessons.les8;
// создать массив из 3х элементов. Вывести сумму
public class Task_1 {
    public static void main(String[] args) {
        int[] anArray = new int[3];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        int sum = 0;
        for (int i = 0; i < anArray.length; i++) {
            sum += anArray[i];
        }
        System.out.println(sum);
    }

}

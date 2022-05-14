package com.company.Lessons.les21map;

import java.util.HashMap;
import java.util.Map;

// Написать программу записи в мап всех четных чисел из промежутка от 0 до 100
public class Test3 {
    public static void main(String[] args) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int index = 1;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                myMap.put(index, i);
                index++;
            }

        }System.out.println(myMap);

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            result += entry.getValue();
        }
        System.out.println("Summa = " + result);
    }
}
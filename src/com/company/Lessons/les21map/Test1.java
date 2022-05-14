package com.company.Lessons.les21map;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 1, j = 9; i < 10 && j>=1; i++, j--) {
            map.put(i,Integer.toHexString(j));
        }
        System.out.println(map);
    }
}
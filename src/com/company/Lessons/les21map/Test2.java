package com.company.Lessons.les21map;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        Car audi = new Car (230, 2000, "a4");
        Car toyota = new Car (200, 2100, "rav4");
        Car mersedes = new Car (250, 3000, "csl");

        Map<Integer, Car> carMap = new HashMap<>();
        carMap.put(1, audi);
        carMap.put(2, toyota);
        carMap.put(3, mersedes);

        System.out.println(carMap);


    }

}

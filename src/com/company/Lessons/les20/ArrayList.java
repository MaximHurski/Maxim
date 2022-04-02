package com.company.Lessons.les20;

import java.util.LinkedList;
import java.util.List;
public class ArrayList {
    public static void main(String[] args) {
        List<String> strings = new java.util.ArrayList<>();
        strings.add("A");
        strings.add("BN");
        strings.add("C");
        strings.add(0,"X");


        List<String> ll = new LinkedList<>();  //используется в основном при необходимости
                                                // удаления/замены элементов в середине списка
        ll.add("CC");
        ll.addAll(strings);
        System.out.println("before removing" + ll);
        ll.removeAll(strings);
        System.out.println("after removing" + ll);

    }
}

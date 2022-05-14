package com.company.Lessons.les28generic.task_2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3};
        SelfList<Integer>selfList = new SelfList<>(arr);
        selfList.add(4);
        selfList.add(5);
        selfList.add(6);
        System.out.println(selfList.getList());

    }
}

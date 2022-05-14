package com.company.Lessons.les23practOOP.task1;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone(11111, 100, "a1");
        Phone phone2 = new Phone(22222, 200, "a2");

        System.out.println(phone1.reciveCall1(phone2));

    }
}

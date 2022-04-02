package com.company.Lessons.les19abstract_interface;

public class Hp implements Computer {
    @Override
    public void turnOff() {
        System.out.println("Hp comp Off");
    }

    @Override
    public void turnOn() {
        System.out.println("Hp comp On");

    }

    @Override
    public void reset() {
        System.out.println("Hp comp restart");

    }
}

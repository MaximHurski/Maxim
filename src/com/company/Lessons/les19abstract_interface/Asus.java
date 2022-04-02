package com.company.Lessons.les19abstract_interface;

public class Asus implements Computer {

    @Override
    public void turnOff() {
        System.out.println("Asus comp Off");
    }

    @Override
    public void turnOn() {
        System.out.println("Asus comp On");

    }

    @Override
    public void reset() {
        System.out.println("Asus comp restart");

    }
}

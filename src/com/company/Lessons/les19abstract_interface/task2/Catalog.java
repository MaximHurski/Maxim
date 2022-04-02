package com.company.Lessons.les19abstract_interface.task2;

public class Catalog {
    private House[] arrayHouse;
    private int index;

    public Catalog(){
        arrayHouse = new House[5];
        index = 0;
    }

    public void addHouse(House house){
        arrayHouse[index++] = house;
    }
}

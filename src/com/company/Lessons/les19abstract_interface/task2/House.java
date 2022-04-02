package com.company.Lessons.les19abstract_interface.task2;

public abstract class House {
    private int amountOfFloor;
    private int amountOfPeople;
    private boolean isHeating;

    House(int amountOfFloor, int amountOfPeople, boolean isHeating){
        this.amountOfFloor = amountOfFloor;
        this.amountOfPeople = amountOfPeople;
        this.isHeating = isHeating;
    }

    public void heatingStatus(boolean heating){
        isHeating = heating;
    }

    public int getAmountOfFloor() {
        return amountOfFloor;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public boolean isHeating() {
        return isHeating;
    }
}

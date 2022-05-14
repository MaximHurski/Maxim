package com.company.Lessons.les23practOOP.task1;

public class Phone {
    private int number;
    private  int weight;
    private String model;

    public Phone(int number, int weight, String model) {
        this.number = number;
        this.weight = weight;
        this.model = model;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String reciveCall1(Phone phone) {
        String str ="Абоненту "+ this.number+" Звонит абонет "+phone.getNumber() + " с мобилы "+ phone.getModel();
        return str;
    }

}

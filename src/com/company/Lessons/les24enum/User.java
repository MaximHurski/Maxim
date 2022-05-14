package com.company.Lessons.les24enum;

public class User {
    private String name;
    private StateEnum stateEnum;

    public String getName() {
        return name;
    }

    public StateEnum getStateEnum() {
        return stateEnum;
    }

    public User(String name, StateEnum stateEnum) {
        this.name = name;
        this.stateEnum = stateEnum;
    }
}

package com.company.Lessons.les24enum.task1;

public class User {
    private String name;
    private Sex sex;

    public User(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public void hello() {
        if (this.sex.equals(Sex.MALE))
            System.out.println("Hello men");
        if (this.sex.equals(Sex.FEMALE))
            System.out.println("Hello woman");
    }
}

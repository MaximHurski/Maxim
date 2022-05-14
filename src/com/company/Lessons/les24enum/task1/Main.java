package com.company.Lessons.les24enum.task1;
// https://www.examclouds.com/ru/java/java-core-russian/perechisleniya
//более подробно
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    User user = new User("Ann", Sex.FEMALE);
    User user1 = new User("Bob", Sex.MALE);
    User user2 = new User("Kate", Sex.FEMALE);


        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);

        for(User user3 : list){
            user3.hello();
        }
    }
}

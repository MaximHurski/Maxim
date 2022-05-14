package com.company.Lessons.les22practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//создать класс персон с именем и возрастом. занести их в мап где ключем будет имя. при вводе с клавиатуры
// двух числел - выводит имена персонов возраст которых попадает в данный диапазон
public class Test_2 {
    public static void main(String[] args) {
        Person dima = new Person("dima", 22);
        Person vova = new Person("vova", 32);
        Person bob = new Person("bob", 42);
        Person rob = new Person("rob", 52);


        Map<String, Integer> personMap = new HashMap<>();
        personMap.put(dima.getName(), dima.getAge());
        personMap.put(vova.getName(), vova.getAge());
        personMap.put(bob.getName(), bob.getAge());
        personMap.put(rob.getName(), rob.getAge());

        System.out.println(personMap);

        System.out.println("Enter range, first num: ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        System.out.println("Enter range, second num: ");
        int secondNum = scanner.nextInt();

        for (Map.Entry<String, Integer> xxx : personMap.entrySet()) {
            if (firstNum < xxx.getValue() && secondNum > xxx.getValue())
                System.out.println(xxx.getKey() + " " + xxx.getValue());
        }
    }
}

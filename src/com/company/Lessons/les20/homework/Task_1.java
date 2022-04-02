package com.company.Lessons.les20.homework;
// Вход на вечеринку только по списку.Есть список имен (коллекция).
// Пользователь вводит с консоли свое имя, а программа проверяет его наличие в списке,
// после чего говорит может он пройти или нет

import java.util.ArrayList;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<String> partyList = new ArrayList<>();
        partyList.add("Maks");
        partyList.add("Irina");
        partyList.add("Alex");
        partyList.add("Vitalya");
        propusk(partyList);
    }

    public static void propusk(ArrayList<String> array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String s = scanner.next();
        boolean hasName = array.contains(s);
        if (hasName == true) {
            System.out.println("Hello " + s + ", you are welcome!");
        } else {
            System.out.println("Get out of here!!!");
        }
    }
}

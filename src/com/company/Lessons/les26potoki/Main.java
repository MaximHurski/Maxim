package com.company.Lessons.les26potoki;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan", "Vasiliy", "Vitaliy");
        Person person1 = new Person("Segey", "Bob", "Max");

        person.start(); //метод страрт открывает новый поток. можно run - просто запустит метод
        person1.start();

    }
}

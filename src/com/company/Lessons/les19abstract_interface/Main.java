package com.company.Lessons.les19abstract_interface;
// Есть интерфейс Computer,у которого есть методы включить, выключить и резет.
// Создайте класс, который бы имплементировал этот интерфейс
public class Main {
    public static void main(String[] args) {
        Computer hp = new Hp();
        callMethod(hp);


        Asus asus = new Asus();
        callMethod(asus);
    }

    public static void callMethod(Computer computer) {
        computer.turnOff();
        computer.turnOn();
        computer.reset();
    }
}

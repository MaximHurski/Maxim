package com.company.Lessons.les18oop;
//2) Создайте массив, состоящий из объектов класса из ‘1'. Найдите кол-во одинаковых объектов в массиве.
public class Task2 {
    //ДАННОЕ РЕШЕНИЕ ДЛЯ ПРИМЕРА. ОНО НЕ УЧИТЫВАЕТ ЕСЛИ БУДЕТ БОЛЕЕ 2Х ОДИНАКОВЫХ ОБЪЕКТОВ!!!
    public static void main(String[] args) {
//        Person person = new Person();
//        person.show();
//        Person dima = new Person(20,"Dima");
//        dima.show();
        Person[]persArray = {new Person(10,"Bob"), new Person(20,"Dima"), new Person()};
        System.out.println(countEquals(persArray));
    }
    public static int countEquals(Person[] persArray){
        int counter = 0;
        for (int i = 0; i<persArray.length; i++){
            for (int j = i+1; j<persArray.length; j++){
                if (persArray[i].equals(persArray[j]));
                counter++;
            }
        }
        return counter;
    }
}

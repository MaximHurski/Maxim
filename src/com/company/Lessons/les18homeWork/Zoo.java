package com.company.Lessons.les18homeWork;

public class Zoo {
    private int count;
    private Animal [] animalsArray;

    public Zoo() {
        this.count = 0;
        this.animalsArray = new Animal[10];
    }

    public void addAnimal(Animal animal){
        animalsArray[count] = animal;
        count++;
    }
    public void soundOff() {
        System.out.println("Nuvber of animals= "+count);
        for (int i = 0; i<count; i++) {
            animalsArray[i].soundOff();
            System.out.println(animalsArray[i].getName());
            System.out.println();
        }
    }
}
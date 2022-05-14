package com.company.Lessons.les28generic.task_2;

public class SelfList<T> {
    private T[] list;
    private int size = 5;
    private int actualSize = 0;

    public SelfList(T[] list) {
        this.list = list;
        this.size = list.length;
        actualSize = list.length;
    }

    public T[] getList() {
        return list;
    }

    public void add(T el){
        T[] srr;
        srr = list.clone();

        this.list = (T[]) new Object[srr.length*2];
        for (int i=0; i< srr.length; i++){
            this.list[i] = srr[i];
        }
        this.list[list.length-1] = el;
    }
}

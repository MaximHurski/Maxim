package com.company.Lessons.les26potoki.test1;

import java.util.Arrays;

public class Min extends Thread{


    int[] array;

    public Min(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        Arrays.sort(array);
        Arrays.toString(array);
        int minNum = array[0];
        System.out.println(minNum);

        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

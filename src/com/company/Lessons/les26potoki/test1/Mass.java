package com.company.Lessons.les26potoki.test1;

import java.util.Arrays;

public class Mass extends Thread{


    int[] array;

    public Mass(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        Arrays.sort(array);
        Arrays.toString(array);
        int maxNum = array [array.length - 1];
        System.out.println(maxNum);

        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }




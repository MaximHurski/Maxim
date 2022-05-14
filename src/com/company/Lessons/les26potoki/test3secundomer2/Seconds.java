package com.company.Lessons.les26potoki.test3secundomer2;

public class Seconds extends Thread{

    private int seconds;

    public int getSeconds() {
        return seconds;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i <= 60; i++) {

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                seconds = i;
            }
        }
    }
}

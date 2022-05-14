package com.company.Lessons.les26potoki.test3secundomer2;

public class Hours extends Thread{
    private int hours;

    public int getHours() {
        return hours;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i <= 100000; i++) {

                try {
                    sleep(3600000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hours = i;
            }
        }
    }
}

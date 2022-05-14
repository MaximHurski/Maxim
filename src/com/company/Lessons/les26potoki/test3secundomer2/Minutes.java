package com.company.Lessons.les26potoki.test3secundomer2;

public class Minutes extends Thread {
    private int minutes = 0;

    public int getMinutes() {
        return minutes;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i <= 60; i++) {

                try {
                    sleep(60000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                minutes = i;
            }

        }
    }
}

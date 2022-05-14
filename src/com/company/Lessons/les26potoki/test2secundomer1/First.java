package com.company.Lessons.les26potoki.test2secundomer1;

public class First extends Thread{
    @Override
    public void run(){
        for (int i = 1; i < 100; i+=2) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


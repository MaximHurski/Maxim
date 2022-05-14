package com.company.Lessons.les26potoki.test2secundomer1;

    public class Second extends Thread{

        @Override
        public void run(){
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 2; i < 100; i+=2) {

                System.out.println(i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


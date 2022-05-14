package com.company.Lessons.les26potoki.test3secundomer2;

public class DexSeconds extends Thread{
    private int dexsecs;

    public int getDexsecs() {
        return dexsecs;
    }

    @Override
    public void run() {
        while (true){
            for (int i=1; i<=100; i++) {

                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dexsecs = i;
            }
        }
    }
}

package com.company.Lessons.les26potoki.test3secundomer2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DexSeconds dexSeconds = new DexSeconds();
        Seconds seconds = new Seconds();
        Minutes minutes = new Minutes();
        Hours hours = new Hours();

        dexSeconds.start();
        seconds.start();
        minutes.start();
        hours.start();

        while (true){
            Thread.sleep(10);
            System.out.println("Hours: " + hours.getHours() + " Minutes: " + minutes.getMinutes() + " Seconds: "
                    + seconds.getSeconds() + " Dex: " + dexSeconds.getDexsecs() );
        }
    }
}

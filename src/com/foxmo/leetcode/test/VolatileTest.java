package com.foxmo.leetcode.test;

public class VolatileTest {
    public volatile int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) throws InterruptedException {
        final VolatileTest test = new VolatileTest();
        for (int i = 0; i < 10; i++) {
            new Thread() {
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        test.increase();
                    }
                }
            }.start();
        }


        Thread.sleep(30000);
//        while(Thread.activeCount()>1){//保证前面的线程都执行完
//            System.out.println(Thread.activeCount());
//            Thread.getAllStackTraces();
//            Thread.yield();
//        }

        System.out.println(test.inc);
    }

}

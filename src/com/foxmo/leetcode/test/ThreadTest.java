package com.foxmo.leetcode.test;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {
    @Test
    public void test1() throws InterruptedException {
        Thread thread = new Thread(new RunClass());
        thread.start();
//        thread.sleep(1000);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        })

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("runnable");
            }
        };
        thread1.start();

    }

    public class RunClass implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

    @Test
    public void test2() throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 0; i < 100; i++) {
                    sum += i;
                }
                return sum;
            }
        };

        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();

        System.out.println("子线程计算结果为：" + futureTask.get());
    }
}

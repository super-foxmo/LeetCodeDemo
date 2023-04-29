package com.foxmo.leetcode.test;

public class CASTest {
    private volatile int a;
    public static void main(String[] args){
        CASTest casTest=new CASTest();
        new Thread(()->{
            for (int i = 1; i < 5; i++) {
                casTest.increment(i);
                System.out.print(casTest.a+" ");
            }
        }).start();
        new Thread(()->{
            for (int i = 1; i < 5; i++) {
                casTest.increment(i);
                System.out.print(casTest.a+" ");
            }
        }).start();
        new Thread(()->{
            for (int i = 5 ; i <10 ; i++) {
                casTest.increment(i);
                System.out.print(casTest.a+" ");
            }
        }).start();
    }

    private void increment(int x){
        while (true){
            try {
//                if (this.a == x - 1){
//                    a++;
//                    break;
//                }

//                long fieldOffset = unsafe.objectFieldOffset(CASTest.class.getDeclaredField("a"));
//                if (unsafe.compareAndSwapInt(this,fieldOffset,x-1,x))
//                    break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

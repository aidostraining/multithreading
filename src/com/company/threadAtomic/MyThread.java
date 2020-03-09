package com.company.threadAtomic;

public class MyThread implements Runnable {
    public static volatile int count;
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            count++;
        }
        System.out.println(count);
    }
}

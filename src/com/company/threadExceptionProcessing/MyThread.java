package com.company.threadExceptionProcessing;

class MyThread implements Runnable {
    public void run() {
        throw new RuntimeException();
    }
}
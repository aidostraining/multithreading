package com.company.threadExceptionProcessing;

class SimpleThread implements Runnable {
    public void run() {
        throw new RuntimeException("It is a great exception.");
    }
}

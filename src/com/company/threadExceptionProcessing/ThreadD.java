package com.company.threadExceptionProcessing;

class ThreadD extends Thread {
    public ThreadD(String threadname, ThreadGroup tgOb) {
        super(tgOb, threadname);
    }
    public void run() {
        throw new RuntimeException("Oy, exception!!!");
    }
}
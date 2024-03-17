package com.teachmeskills.lesson20.task1.task1_1.threads;

public class ReadingNews implements Runnable{
    Thread thread;

    public ReadingNews(String name) {
        System.out.println("Thread 3: " + name);
        thread = new Thread(this);
        thread.start();
        thread.setPriority(3);
    }

    @Override
    public void run() {
        toRead();
    }

    public void toRead() {
        System.out.println("Reading news.");
    }

}


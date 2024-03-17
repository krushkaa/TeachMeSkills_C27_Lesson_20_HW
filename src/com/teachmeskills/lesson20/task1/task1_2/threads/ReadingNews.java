package com.teachmeskills.lesson20.task1.task1_2.threads;

public class ReadingNews extends Thread{
    private String threadName;

    public ReadingNews(String name) {
        System.out.println("Thread 3: " + name);
        this.threadName = name;
    }

    @Override
    public void run() {
        toRead();
    }

    public void toRead() {
        System.out.println("Reading news.");
    }

}


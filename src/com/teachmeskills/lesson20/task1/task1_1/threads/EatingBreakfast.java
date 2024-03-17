package com.teachmeskills.lesson20.task1.task1_1.threads;

public class EatingBreakfast implements Runnable {
    Thread thread;

    public EatingBreakfast(String name) {
        System.out.println("Thread 2: " + name);
        thread = new Thread(this);
        thread.start();
        thread.setPriority(2);
    }

    @Override
    public void run() {
        toEat();
    }

    public void toEat() {
        System.out.println("Eating breakfast.");
    }

}

package com.teachmeskills.lesson20.task1.task1_2.threads;

public class EatingBreakfast extends Thread{
    private String threadName;

    public EatingBreakfast(String name) {
        System.out.println("Thread 2: " + name);
        this.threadName = name;
    }

    @Override
    public void run() {
        toEat();
    }

    public void toEat() {
        System.out.println("Eating breakfast.");
    }

}

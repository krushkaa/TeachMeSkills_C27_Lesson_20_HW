package com.teachmeskills.lesson20.task1.task1_1.threads;

public class DrinkingCoffee implements Runnable {
    Thread thread;

    public DrinkingCoffee(String name) {
        System.out.println("Thread 1: " + name);
        thread = new Thread(this);
        thread.start();
        thread.setPriority(1);
    }

    @Override
    public void run() {
        toDrink();
    }

    public void toDrink() {
        System.out.println("Drinking coffee.");
    }

}

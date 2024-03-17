package com.teachmeskills.lesson20.task1.task1_2.threads;

public class DrinkingCoffee extends Thread{
    private String threadName;

    public DrinkingCoffee(String name) {
        System.out.println("Thread 1: " + name);
        this.threadName = name;
    }

    @Override
    public void run() {
        toDrink();
    }

    public void toDrink() {
        System.out.println("Drinking coffee.");
    }

}

package com.teachmeskills.lesson20.task2.model;

public class CarStation {

    private int carCount = 0;

    public synchronized void get(){
        while (carCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        carCount--;
        System.out.println("Клиент забрал машину со станции.");
        System.out.println("Машин на станции " + carCount);

        notify();
    }

      public synchronized void put(){
        while(carCount >= 7){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        carCount++;
        System.out.println("Клиент пригнал машину на санцию.");
        System.out.println("Машин на станции " + carCount);

        notify();
    }

}

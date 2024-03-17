package com.teachmeskills.lesson20.task2.model;

import com.teachmeskills.lesson20.task2.consts.Consts;

public class GivingCar implements Runnable {

    private CarStation store;

    public GivingCar(CarStation store) {
        this.store = store;
    }

    @Override
    public void run() {
        driveCarToStation();
    }

    private void driveCarToStation(){
        for(int i = 1; i < Consts.STATION_SIZE; i++){
            store.put();
        }
    }
}

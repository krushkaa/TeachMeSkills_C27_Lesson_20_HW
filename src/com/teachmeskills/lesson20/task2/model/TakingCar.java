package com.teachmeskills.lesson20.task2.model;

import com.teachmeskills.lesson20.task2.consts.Consts;

public class TakingCar implements Runnable {

    private CarStation store;

    public TakingCar(CarStation store) {
        this.store = store;
    }

    @Override
    public void run() {
        driveCarFromStation();
    }

    private void driveCarFromStation(){
        for(int i = 1; i < Consts.STATION_SIZE; i++){
            store.get();
        }
    }
}

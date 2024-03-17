package com.teachmeskills.lesson20.task2.run;

import com.teachmeskills.lesson20.task2.model.CarStation;
import com.teachmeskills.lesson20.task2.model.GivingCar;
import com.teachmeskills.lesson20.task2.model.TakingCar;

public class Runner {

    public static void main(String[] args) {

        CarStation carStation = new CarStation();

        GivingCar sadCustomer = new GivingCar(carStation);
        TakingCar happyCustomer = new TakingCar(carStation);

        Thread t2 = new Thread(happyCustomer);
        t2.start();

        Thread t1 = new Thread(sadCustomer);
        t1.start();

    }

}

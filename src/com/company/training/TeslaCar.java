package com.company.training;

import com.company.training.interfaces.BatteryType;
import com.company.training.interfaces.Car;
import com.company.training.interfaces.CarTypeAutomatic;

public class TeslaCar extends Car implements CarTypeAutomatic, BatteryType {


    public TeslaCar(String color, int doors, String engineType) {
        super(color, doors,engineType);
    }

    @Override
    public void autoTransmission() {

        System.out.println("Auto transmission is smooth drive !!");
    }

    @Override
    public void battCharging() {
        System.out.println("You need to charge me !!");
    }
}

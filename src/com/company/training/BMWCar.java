package com.company.training;

import com.company.training.interfaces.Car;
import com.company.training.interfaces.CarTypeManual;
import com.company.training.interfaces.GasType;

public class BMWCar extends Car implements CarTypeManual, GasType {


    public BMWCar(String color, int doors, String engineType) {

        super(color, doors,engineType);
    }

    @Override
    public void manualShift() {

        System.out.println("Manual Shift got more powerful ride !!");
    }

    @Override
    public void fillGas() {

        System.out.println("This car needs premium gas only !!!");
    }
}

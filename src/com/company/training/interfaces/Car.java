package com.company.training.interfaces;

public abstract class Car {

    String color;
    int doors;
    String engineType;

    public Car(String color, int doors,String engineType) {
        this.color = color;
        this.doors = doors;
        this.engineType=engineType;

        System.out.println("Car with " + color + " - and numbers of doors " + doors+" with engine type "+engineType);
    }

   // public abstract void priceOfCar();

    // public abstract void driveType();

}

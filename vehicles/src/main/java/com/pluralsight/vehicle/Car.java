package com.pluralsight.vehicle;

public class Car extends Vehicle{
    private String modelAndMake;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String modelAndMake) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.modelAndMake = modelAndMake;
    }

    public String getModelAndMake() {
        return modelAndMake;
    }

    public void setModelAndMake(String modelAndMake) {
        this.modelAndMake = modelAndMake;
    }
}

package com.pluralsight.vehicle;

public class Moped extends Vehicle {
    public String getHelmentName() {
        return helmentName;
    }

    public void setHelmentName(String helmentName) {
        this.helmentName = helmentName;
    }

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String helmentName) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.helmentName = helmentName;
    }

    private String helmentName;
}

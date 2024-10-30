package com.pluralsight.vehicle;

public class SemiTruck extends Vehicle{
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String location) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.location = location;
    }
}

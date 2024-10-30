package com.pluralsight.vehicle;

public class Hovercraft extends Vehicle{
    public String getWaterArea() {
        return waterArea;
    }

    public void setWaterArea(String waterArea) {
        this.waterArea = waterArea;
    }

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String waterArea) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.waterArea = waterArea;
    }

    private String waterArea;
}

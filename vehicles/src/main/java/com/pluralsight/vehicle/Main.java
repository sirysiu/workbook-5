package com.pluralsight.vehicle;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped("red", 1, 10, 5, "full");
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        System.out.println(slowRide.getColor() + " " + slowRide.getFuelCapacity());
    }
}

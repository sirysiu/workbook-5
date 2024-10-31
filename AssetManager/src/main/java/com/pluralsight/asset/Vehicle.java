package com.pluralsight.asset;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("+------------------+----------------------+\n");
        sb.append("| Property         | Value                |\n");
        sb.append("+------------------+----------------------+\n");
        sb.append(String.format("| Make/Model       | %s\n", makeModel));
        sb.append(String.format("| Year             | %d\n", year));
        sb.append(String.format("| Odometer         | %d\n", odometer));
        sb.append(String.format("| Description      | %s\n", description));
        sb.append(String.format("| Date Acquired    | %s\n", dateAcquired));
        sb.append(String.format("| Original Cost    | %.2f\n", originalCost));
        sb.append("+------------------+----------------------+\n");
        return sb.toString();
    }

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double value = originalCost;
        if (year <= 3) {
            return value -= originalCost * 0.03 * year;
        } else if (year <= 6) {
            return  value -= originalCost * 0.06 * year;
        } else if (year <= 10) {
            return value -= originalCost * 0.08 * year;
        } else {
            return  value -=  1000;
        }
//        if (odometer > 100000) {
//            return   value -= originalCost *.25;
//        }
//        return 0;
    }
}

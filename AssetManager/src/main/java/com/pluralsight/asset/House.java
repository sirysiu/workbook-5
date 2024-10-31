package com.pluralsight.asset;

public class House extends Asset{
    private String address;
    private  int condition;
    private int squareFoot;
    private int lotSize;



    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public double getValue(){
        double value = lotSize *.25 + originalCost;
        if (condition == 1){
            return squareFoot * 180 + value;
        } else if (condition == 2) {
            return squareFoot * 130 + value;
        } else if (condition == 3) {
            return squareFoot * 90+ value;
        } else if (condition == 4){
            return squareFoot * 80 +value;
        } else
        return 0;

    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("+------------------+----------------------+\n");
        sb.append("| Property         | Value                |\n");
        sb.append("+------------------+----------------------+\n");
        sb.append(String.format("| Address          | %s\n", address));
        sb.append(String.format("| Condition        | %s\n", condition));
        sb.append(String.format("| Square Foot      | %d\n", squareFoot));
        sb.append(String.format("| Lot Size         | %d\n", lotSize));
        sb.append(String.format("| Description      | %s\n", description));
        sb.append(String.format("| Date Acquired    | %s\n", dateAcquired));
        sb.append(String.format("| Original Cost    | %.2f\n", originalCost));
        sb.append("+------------------+----------------------+\n");
        return sb.toString();
    }

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }
}

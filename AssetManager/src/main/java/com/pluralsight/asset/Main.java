package com.pluralsight.asset;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("Family house", "2024-10-13", 130000, "123 Sesame st", 1, 100, 50 ));
        assets.add(new Vehicle("Honda", "2204-23-23", 20000, "Lexus RC", 1, 1000));

        for (int i = 0; i < assets.size() -1; i++){
            System.out.println(assets);
            System.out.println("Total Value: "+ assets.get(i).getValue());
        }

    }
}

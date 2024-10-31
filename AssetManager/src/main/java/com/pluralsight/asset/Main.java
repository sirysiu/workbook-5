package com.pluralsight.asset;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("Family house", "2024-10-13", 130000, "123 Sesame st", 1, 100, 50 ));

        for (int i = 0; i < assets.size(); i++){
            System.out.println(assets);
            System.out.println("Total Value: " + assets.get(i).getValue());

        }

    }
}

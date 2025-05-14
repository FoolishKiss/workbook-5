package com.pluralsight;

import java.util.ArrayList;

public class AssetManagerApp {
    public static void main(String[] args) {

        // Make array list for assets
        ArrayList<Asset> assets = new ArrayList<Asset>();

        // Add houses
        assets.add(new House("My Crib","2020-01-01",300000,"123 around the way St",1,25000,5000));
        assets.add(new House("My Vacay Spot","2025-01-01",350000,"456 Somewhere Beachfront Ave",2,20000,5000));

        // Add vehicles
        assets.add(new Vehicle("My Car","2019-01-01",30000,"Ford Mustang",2024,100));
        assets.add(new Vehicle("My Other Car","2023-01-01",50000,"Buick Lacrosse",2020,25000));

        // Loop through assets and displays details
        for (Asset asset : assets) {
            System.out.println( "\n" + "Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.printf("Original Cost: $%.2f\n", asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f\n", asset.getValue());

            // Instanceof to print out specific details of assets
            //Checks to see if asset is a House and if true puts it in variable house
            if (asset instanceof House house) {
                System.out.println("Address: " + house.getAddress());
              //Checks to see if asset is a Vehicle and if true puts it in variable vehicle
            } else if (asset instanceof Vehicle vehicle) {
                System.out.println("Make/ Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear() + "\n");

            }
        }


    }
}

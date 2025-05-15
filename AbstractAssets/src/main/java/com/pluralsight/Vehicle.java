package com.pluralsight;

import java.util.Calendar;

// Class that inherits from asset
public class Vehicle extends Asset {

    // Variables for vehicles
    private String makeModel;
    private int year;
    private int odometer;

    // Constructor for
    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    // Getters and Setters
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

    // Override method to get vehicle value
    @Override
    public double getValue() {

        // Creates a calendar and gets the year from the current date
        // and stores it in current year
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - year;
        double value = getOriginalCost();

        // If statement to get value of car based off age
        if (age <= 3){
            value -= value * 0.03 * age;
        } else if (age <= 6) {
            value -= value * 0.06 * age;
        } else if (age <= 10) {
            value -= value * 0.08 * age;
        } else {
            value = 1000.0;
        }

        // If the car has more than 100,000 miles
        // and is not a Honda |or| Toyota than the value gets reduced by 25%
        if (odometer > 100000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
            value *= 0.75;
        }

        // Return the value of the vehicle
        return value;
    }
}    
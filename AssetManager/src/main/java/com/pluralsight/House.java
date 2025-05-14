package com.pluralsight;

// Class that inherits from asset
public class House extends Asset {

    // Variables for house
    private String address;
    private int condition;
    private int squareFeet;
    private int lotSize;

    // Constructor for house
    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFeet, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFeet = squareFeet;
        this.lotSize = lotSize;
    }

    // Getters and Setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    // Override method to get house value
    @Override
    public double getValue() {

        // Variable for square ft value
        double valuePerSqFt;
        // Switch statement to pick the value per sqft
        switch (condition) {
            case 1:
                valuePerSqFt = 180;
                break;
            case 2:
                valuePerSqFt = 130;
                break;
            case 3:
                valuePerSqFt = 90;
                break;
            case 4:
                valuePerSqFt = 80;
                break;
            default:
                valuePerSqFt = 0;
                break;
        }
        // Returns the house value
        return (valuePerSqFt * squareFeet) + (0.25 * lotSize);
    }
}
package com.pluralsight;

public class Cash extends Asset {

    private String incomeStream;


    public Cash(String description, String dateAcquired, double originalCost, String incomeStream) {
        super(description, dateAcquired, originalCost);
        this.incomeStream = incomeStream;
    }

    public String getIncomeStream() {
        return incomeStream;
    }

    public void setIncomeStream(String incomeStream) {
        this.incomeStream = incomeStream;
    }

    @Override
    public double getValue() {
        return getOriginalCost();
    }
}

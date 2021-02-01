package com.thecodechemist.financetracker;

public class FinancialTransaction {

    private String location;
    private boolean isOutgoing;
    private double value;
    private String date;

    public FinancialTransaction(String date, String location, boolean isOutgoing, double value) {
        this.date = date;
        this.location = location;
        this.isOutgoing = isOutgoing;
        this.value = value;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isOutgoing() {
        return isOutgoing;
    }

    public void setOutgoing(boolean outgoing) {
        isOutgoing = outgoing;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

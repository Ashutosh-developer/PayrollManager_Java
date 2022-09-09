package com.MyGame.hr;

public class Contractor implements Payable{

    private int hoursWorked;
    private double partsCost;

    @Override
    public double calculatePay() {
        return 0;
    }

    @Override
    public String generatePayStub() {
        return null;
    }
}

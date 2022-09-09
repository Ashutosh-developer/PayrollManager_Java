package com.MyGame.hr;

public class hourlyEmployee extends Employee{

    private int hoursWorked;

    public hourlyEmployee(String name) {
        super(name);
    }

    public hourlyEmployee(String name, int hours) {
        super(name);
        this.hoursWorked = hours;
    }

    @Override
    public double calculatePay() {
        return this.hoursWorked * getPayRate();
    }

    @Override
    public String generatePayStub() {
        return null;
    }
}

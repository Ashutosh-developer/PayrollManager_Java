package com.MyGame.hr;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SalariedEmployee extends Employee{

    private double salary;
    public SalariedEmployee(String name) {
        super(name);
    }

    public SalariedEmployee(String name, double sal){
        super(name);
        this.salary = sal;
    }

    @Override
    public double calculatePay() {
        return this.salary - (this.salary * .3);
    }

    @Override
    public String generatePayStub() {
        Address address = new Address("5 Emmarld Close", "Kingston", "Kington", "0000");
        Company company = new Company("ABC Company", address);

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        String strDate = format.format(date);

        String outStr;
        outStr = "\t\t\t" + company.getName() +
                "\n\t" + "Name: " + getName() + " - Employee Id: " + getEmployee_ID() +
                "\n\t" + "Pay Date \t " + strDate +
                "\n\t" + "Gross Salary $" + salary +
                "\n\t" + "Net Salary $" + calculatePay() + "\n\n";
        return outStr;
    }

    public static void printStub(String filePath, List<SalariedEmployee> employees){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))){
            for(SalariedEmployee employee : employees){
                writer.write(employee.generatePayStub());
            }
        }catch (IOException e){
            System.out.println("An error occurred printing the pay stubs");
            e.printStackTrace();
        }
    }
}

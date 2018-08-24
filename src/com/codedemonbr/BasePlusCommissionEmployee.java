package com.codedemonbr;

public class BasePlusCommissionEmployee extends CommissionEmployee
{
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
        {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityName, double grossSales, double commissionRate, double baseSalary)
    {
        super(firstName, lastName, socialSecurityName, grossSales, commissionRate);
        if (baseSalary < 0)
        {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public double Earnings()
    {
        return baseSalary + (comissionRate * grossSales);
    }

    @Override
    public String toString()
    {
        String str = "";
        str += "Base-salaried commission employee:\n";
        str += "\nComplete name: " + firstName + " " + lastName;
        str += "\nSocial security: " + socialSecurityNumber;
        str += "\nGross sales: " + grossSales + " Commission rate: " + comissionRate;
        str += "\nBase salary: " + baseSalary;
        return str;
    }

}

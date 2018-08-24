package com.codedemonbr;

public class CommissionEmployee
{
    public String getFirstName() {
    return firstName;
}

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        this.grossSales = grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(double comissionRate) {
        if (comissionRate <= 0.0 || comissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Comission rate must be > 0.0 and  < 1.0");
        }
        this.comissionRate = comissionRate;
    }

    protected final String firstName;
    protected final String lastName;
    protected final String socialSecurityNumber;
    protected double grossSales;
    protected double comissionRate;

    public  CommissionEmployee()
    {
        this.firstName = "";
        this.lastName = "";
        this.socialSecurityNumber = "";
        System.out.println("First name, Last name and Social Security must be initialized. Use getters and setter to do it.");
    }
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double comissionRate)
    {
        if(grossSales < 0.0)
        {
            throw new IllegalArgumentException("Gross sales must be > = 0");
        }

        if (comissionRate <= 0.0 || comissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Comission rate must be > 0.0 and  < 1.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.comissionRate = comissionRate;
    }

    public  double Earnings()
    {
        return comissionRate * grossSales;
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", comissionRate);
    }

}


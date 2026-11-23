package week2day3.assignment1;

public class Vehicle {
    protected String vehicleNum;
    protected String model;
    protected double dayRate;
    protected int days;

    public Vehicle(String vehicleNumber, String model, double dayRate, int days) {
        this.vehicleNum = vehicleNumber;
        this.model = model;
        this.dayRate = dayRate;
        this.days = days;
    }

    public double calculateRent() {
        return dayRate * days;
    }

    public void displayDetails() {
        System.out.println(vehicleNum + " | " + model);
    }
}


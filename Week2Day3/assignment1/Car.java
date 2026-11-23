package week2day3.assignment1;


public class Car extends Vehicle {
    private double insPerDay;

    public Car(String vehicleNum, String model, double dayRate, int days, double insPerDay) {
        super(vehicleNum, model, dayRate, days);
        this.insPerDay = insPerDay;
    }

    @Override
    public double calculateRent() {
        return (dayRate + insPerDay) * days;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car  | " + vehicleNum + " | " + model + " | Days: " + days + " | Rent: " + calculateRent());
    }
}


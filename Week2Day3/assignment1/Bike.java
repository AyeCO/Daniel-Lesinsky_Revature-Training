package week2day3.assignment1;

public class Bike extends Vehicle {
    public Bike(String vehicleNum, String model, double dayRate, int days) {
        super(vehicleNum, model, dayRate, days);
    }

    @Override
    public double calculateRent() {
        double totalRent = dayRate * days;
        return totalRent * 0.90;
    }

    @Override
    public void displayDetails() {
    	System.out.println("Bike | " + vehicleNum + " | " + model + " | Days: " + days + " | Rent: " + calculateRent());
    }
}

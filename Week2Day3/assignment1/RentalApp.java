package week2day3.assignment1;

import java.util.Scanner;

public class RentalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int num = sc.nextInt();

        Vehicle[] vehicles = new Vehicle[num];

        for (int i = 0; i < num; i++) {
            int type;
            while (true) {
                System.out.print(
                    "Enter type (1-Car, 2-Bike): "
                );
                type = sc.nextInt();
                if (type == 1 || type == 2) {
                    break;
                }
                else {
                    System.out.println("Invalid vehicle type! Please try again.");
                }
            }

            sc.nextLine();

            System.out.print("Enter Vehicle Number: ");
            String vehicleNum = sc.nextLine();

            System.out.print("Enter Model: ");
            String model = sc.nextLine();

            System.out.print("Enter Rate per Day: ");
            double dayRate = sc.nextDouble();

            System.out.print("Enter Days: ");
            int days = sc.nextInt();

            if (type == 1) {
                System.out.print("Enter Insurance per Day: ");
                double insurance = sc.nextDouble();

                Vehicle veh = new Car(
                    vehicleNum, model,
                    dayRate, days, insurance
                );

                vehicles[i] = veh;

            }
            else {
                Vehicle veh = new Bike(
                    vehicleNum, model,
                    dayRate, days
                );
                vehicles[i] = veh;
            }
        }

        System.out.println("\n--- Rental Details ---");

        double totalRent = 0;

        for (Vehicle v : vehicles) {
            v.displayDetails();
            totalRent += v.calculateRent();
        }
        
        System.out.printf("Total Rent Collected: " + totalRent);

        sc.close();
    }
}

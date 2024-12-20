package oop.java.eversor.animarum;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Vehicle> rentalHistory;

    public Customer(String name) {
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public String getName() { return name; }
    public List<Vehicle> getRentalHistory() { return rentalHistory; }

    public void rentVehicle(Vehicle vehicle, int days) {
        if (vehicle.isAvailableForRental()) {
            vehicle.setAvailable(false);
            rentalHistory.add(vehicle);
            System.out.println(name + " rented " + vehicle.getModel() + " for " + days + " days.");
        } else {
            System.out.println(vehicle.getModel() + " is not available for rental.");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.setAvailable(true);
        System.out.println(name + " returned " + vehicle.getModel() + ".");
    }
}

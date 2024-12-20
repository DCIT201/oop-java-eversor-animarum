package oop.java.eversor.animarum;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void listAvailableVehicles() {
        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailableForRental()) {
                System.out.println(vehicle.getModel() + " is available for rent.");
            }
        }
    }
}

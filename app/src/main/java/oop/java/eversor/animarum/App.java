package oop.java.eversor.animarum;

public class App {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        Vehicle car = new Car("1", "Toyota", 50);
        Vehicle motorcycle = new Motorcycle("2", "Harley", 30);
        Vehicle truck = new Truck("3", "Ford", 80);

        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        Customer customer = new Customer("John Doe");

        RentalTransaction rental = new RentalTransaction(customer, car, 5);
        rental.processRental();

        agency.listAvailableVehicles();

        rental.processReturn();
    }
}

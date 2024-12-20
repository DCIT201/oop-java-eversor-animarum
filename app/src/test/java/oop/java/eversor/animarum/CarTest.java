package oop.java.eversor.animarum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CarTest {
    @Test void testCarConstructor() {
        Car car = new Car("1", "Toyota", 50);
        assertEquals("1", car.getVehicleId());
        assertEquals("Toyota", car.getModel());
        assertEquals(50, car.getBaseRentalRate());
    }

    @Test void testCalculateRentalCost() {
        Car car = new Car("1", "Toyota", 50);
        assertEquals(150, car.calculateRentalCost(3));
    }

    @Test void testIsAvailableForRental() {
        Car car = new Car("1", "Toyota", 50);
        assertTrue(car.isAvailableForRental());
        car.setAvailable(false);
        assertFalse(car.isAvailableForRental());
    }
}

package oop.java.eversor.animarum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class MotorcycleTest {
    @Test void testMotorcycleConstructor() {
        Motorcycle motorcycle = new Motorcycle("2", "Harley", 30);
        assertEquals("2", motorcycle.getVehicleId());
        assertEquals("Harley", motorcycle.getModel());
        assertEquals(30, motorcycle.getBaseRentalRate());
    }

    @Test void testCalculateRentalCost() {
        Motorcycle motorcycle = new Motorcycle("2", "Harley", 30);
        assertEquals(72, motorcycle.calculateRentalCost(3));
    }

    @Test void testIsAvailableForRental() {
        Motorcycle motorcycle = new Motorcycle("2", "Harley", 30);
        assertTrue(motorcycle.isAvailableForRental());
        motorcycle.setAvailable(false);
        assertFalse(motorcycle.isAvailableForRental());
    }
}

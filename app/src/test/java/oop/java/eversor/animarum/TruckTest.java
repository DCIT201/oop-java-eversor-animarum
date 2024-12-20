package oop.java.eversor.animarum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class TruckTest {
    @Test void testTruckConstructor() {
        Truck truck = new Truck("3", "Ford", 80);
        assertEquals("3", truck.getVehicleId());
        assertEquals("Ford", truck.getModel());
        assertEquals(80, truck.getBaseRentalRate());
    }

    @Test void testCalculateRentalCost() {
        Truck truck = new Truck("3", "Ford", 80);
        assertEquals(288, truck.calculateRentalCost(3));
    }

    @Test void testIsAvailableForRental() {
        Truck truck = new Truck("3", "Ford", 80);
        assertTrue(truck.isAvailableForRental());
        truck.setAvailable(false);
        assertFalse(truck.isAvailableForRental());
    }
}

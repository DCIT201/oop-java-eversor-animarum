package oop.java.eversor.animarum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class VehicleTest {
    @Test void testVehicleConstructor() {
        Vehicle vehicle = new Car("1", "Toyota", 50);
        assertEquals("1", vehicle.getVehicleId());
        assertEquals("Toyota", vehicle.getModel());
        assertEquals(50, vehicle.getBaseRentalRate());
    }

    // Other test methods
}

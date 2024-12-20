package oop.java.eversor.animarum;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test void testMain() {
        // Since the main method contains print statements, we can check the structure but not assert the outputs directly.
        // One way to test this indirectly is by verifying no exceptions are thrown during execution.
        App.main(new String[]{});
        // No exceptions should be thrown
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void testGearOneAddsOneToSpeed() {
        double result = Bike.gearOne(15.0);
        assertEquals(16.0, result);
    }

    @Test
    public void testAccelerateWithValidGear() {
        // Capture output using a PrintStream if needed, but here we test logic
        assertDoesNotThrow(() -> Bike.accelerate(20.0, 2));
    }

    @Test
    public void testAccelerateWithGearOne() {
        double speed = 10.0;
        int gear = 1;
        double expected = speed + gear;
        Bike.accelerate(speed, gear); // Should print 11.0
        // You can redirect System.out to capture output if needed
    }

    @Test
    public void testAccelerateThrowsExceptionForInvalidGearAbove4() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Bike.accelerate(25.0, 5);
        });
        assertEquals("Invalid gear: must be between 1 and 4", exception.getMessage());
    }

    @Test
    public void testAccelerateThrowsExceptionForInvalidGearBelow1() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Bike.accelerate(25.0, 0);
        });
        assertEquals("Invalid gear: must be between 1 and 4", exception.getMessage());
    }
}

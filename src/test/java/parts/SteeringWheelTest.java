package parts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SteeringWheelTest {
    SteeringWheel steeringWheel;

    @Before
    public void setUp() {

    }

    @Test
    public void canTurnLeft() {
        assertEquals("Turning Left",SteeringWheel.turnLeft());
    }
    @Test
    public void canTurnRight() {
        assertEquals("Turning Right",SteeringWheel.turnRight());
    }
}

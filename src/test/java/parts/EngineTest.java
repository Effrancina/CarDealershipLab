package parts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EngineTest {
    Engine engine;

    @Before
    public void setUp() {
        engine = new Engine(250);
    }

    @Test
    public void getHorsepower() {
        assertEquals(250,engine.getHorsepower());
    }
}
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle("bottle1");
    }

    @Test
    public void bottleHasName(){
        assertEquals("bottle1", waterBottle.getName());
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }
}

import org.junit.Before;
import org.junit.Test;
import parts.Engine;
import parts.EngineType;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
       engine = new Engine(EngineType.PETROL, 2000);
    }

    @Test
    public void hasEngineType(){
        assertEquals(EngineType.PETROL, engine.getType());
    }

    @Test
    public void hasHorsePower(){
        assertEquals(2000, engine.getHorsePower());
    }


}

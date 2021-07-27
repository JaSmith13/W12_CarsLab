import org.junit.Before;
import org.junit.Test;
import parts.Tyre;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before() {
        tyre = new Tyre(22, "Michelin");
    }

    @Test
    public void hasSize(){
        assertEquals(22, tyre.getSize());
    }

    @Test
    public void hasBrand(){
        assertEquals("Michelin", tyre.getBrand());
    }

}

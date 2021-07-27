import cars.Car;
import org.junit.Before;
import org.junit.Test;
import parts.EngineType;
import parts.Tyre;
import parts.Engine;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Tyre tyre;
    Engine engine;
    ArrayList<Tyre> tyres;

    @Before
    public void before(){
        engine = new Engine(EngineType.PETROL, 2000);
        tyre = new Tyre(22, "Michelin");
        tyres = new ArrayList<>();
        tyres.add(tyre);
        tyres.add(tyre);
        tyres.add(tyre);
        tyres.add(tyre);
        car = new Car(engine, tyres, 5000, "Dodger Blue", "Toyota", "500");
    }

    @Test
    public void has2000HorsePowerPetrolEngine(){
        assertEquals(EngineType.PETROL, car.getEngine().getType());
        assertEquals(2000, car.getEngine().getHorsePower());
    }

    @Test
    public void hasColour(){
        assertEquals("Dodger Blue", car.getColour());
    }

    @Test
    public void has4Tyres(){
        assertEquals(4, car.getTyres().size());
    }
}

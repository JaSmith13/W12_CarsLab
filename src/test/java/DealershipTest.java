import businesses.Dealership;
import cars.Car;
import org.junit.Before;
import org.junit.Test;
import parts.Engine;
import parts.EngineType;
import parts.Tyre;
import people.Customer;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;
    Tyre tyre;
    Engine engine;
    ArrayList<Tyre> tyres;
    ArrayList<Car> dealershipCars;

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
        dealershipCars = new ArrayList<>();
        dealershipCars.add(car);
        dealership = new Dealership(6000, dealershipCars);
    }

    @Test
    public void hasMoneyInTill(){
        assertEquals(6000, dealership.getTill(), 0.01);
    }

    @Test
    public void hasCars(){
        assertEquals(1, dealership.getCars().size());
    }
}

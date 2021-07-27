import cars.Car;
import org.junit.Before;
import org.junit.Test;
import parts.Engine;
import parts.EngineType;
import parts.Tyre;
import people.Customer;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Tyre tyre;
    Engine engine;
    ArrayList<Tyre> tyres;
    ArrayList<Car> customerCars;

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
        customerCars = new ArrayList<>();
        customerCars.add(car);
        customer = new Customer(6000, customerCars);
    }

    @Test
    public void hasMoney(){
        assertEquals(6000, customer.getMoney(), 0.01);
    }

    @Test
    public void hasOwnCar(){
        assertEquals(1, customer.getOwnCars().size());
    }
}

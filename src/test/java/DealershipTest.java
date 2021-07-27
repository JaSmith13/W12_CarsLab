import businesses.Dealership;
import cars.Car;
import org.junit.Before;
import org.junit.Test;
import parts.Damage;
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
        car = new Car(engine, tyres, 1000, "Dodger Blue", "Toyota", "500");
        dealershipCars = new ArrayList<>();
        dealershipCars.add(car);
        customerCars = new ArrayList<>();
        customerCars.add(car);
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

    @Test
    public void canBuyCar(){
        dealership.buyCar(car);
        assertEquals(2, dealership.getCars().size());
        assertEquals(5000, dealership.getTill(), 0.01);
    }

    @Test
    public void cannotBuyCarIfNoFunds(){
        Dealership poorDealership = new Dealership(50, dealershipCars);
        poorDealership.buyCar(car);
        assertEquals(1, poorDealership.getCars().size());
        assertEquals(50, poorDealership.getTill(), 0.01);
    }

    @Test
    public void canSellCarToCustomer(){
        Customer customer = new Customer(5000, customerCars);
        dealership.sellCar(customer);
        assertEquals(2, customer.getOwnCars().size());
        assertEquals(0, dealership.getCars().size());
    }

    @Test
    public void canRepairVehicles(){
        Damage damage = new Damage("popped tyre", 500);
        car.addDamage(damage);
        dealership.repairDamage(car, "popped tyre");
        assertEquals(1000, car.getPrice(), 0.01);
        assertEquals(5500, dealership.getTill(), 0.01);
    }

    @Test
    public void cannotRepairNonExistentDamage(){
        Damage damage = new Damage("popped tyre", 500);
        car.addDamage(damage);
        dealership.repairDamage(car, "broken windshield");
        assertEquals(1, car.getDamages().size());
        assertEquals(6000, dealership.getTill(), 0.01);
    }


}

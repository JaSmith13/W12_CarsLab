package people;

import behaviours.Buy;
import cars.Car;

import java.util.ArrayList;

public class Customer implements Buy {

    private double money;
    private ArrayList<Car> ownCars;

    public Customer(double money, ArrayList<Car> ownCars) {
        this.money = money;
        this.ownCars = ownCars;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Car> getOwnCars() {
        return ownCars;
    }

    public void buyCar(Car car) {
        if(getMoney() >= car.getPrice()) {
            this.ownCars.add(car);
            this.money -= car.getPrice();
        }
    }
}

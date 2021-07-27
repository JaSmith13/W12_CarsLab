package people;

import cars.Car;

import java.util.ArrayList;

public class Customer {

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
}

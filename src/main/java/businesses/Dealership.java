package businesses;

import cars.Car;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Car> cars;

    public Dealership(double till, ArrayList<Car> cars) {
        this.till = till;
        this.cars = cars;
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}

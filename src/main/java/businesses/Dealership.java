package businesses;

import behaviours.Buy;
import cars.Car;
import parts.Damage;
import people.Customer;

import java.util.ArrayList;

public class Dealership implements Buy {

    private double till;
    private ArrayList<Car> cars;

    public Dealership(double till, ArrayList<Car> cars) {
        this.till = till;
        this.cars = cars;
    }

    public double getTill() {
        return till;
    }

    public void makeMoney(double amount) {
        this.till += amount;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void buyCar(Car car) {
        if(getTill() >= car.getPrice()) {
            this.cars.add(car);
            this.till -= car.getPrice();
        }
    }

    public void sellCar(Customer customer) {
        double carPrice = this.cars.get(0).getPrice();
        this.makeMoney(carPrice);
        customer.buyCar(this.cars.get(0));
        this.cars.remove(0);
    }

    public void repairDamage(Car car, String damageDescription) {
        ArrayList<Damage> damagesToRemove = new ArrayList<>();
        for(Damage damage: car.getDamages()){
            if(damage.getDescription() == damageDescription){
                this.till -= damage.getCostToRepair();
                damagesToRemove.add(damage);
            }
        }
        car.removeDamage(damagesToRemove);
    }
}

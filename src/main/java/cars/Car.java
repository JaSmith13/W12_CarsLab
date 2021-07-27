package cars;

import parts.Damage;
import parts.Engine;
import parts.Tyre;

import java.util.ArrayList;

public class Car {

    private Engine engine;
    private ArrayList<Tyre> tyres;
    private double price;
    private String colour;
    private String make;
    private String model;
    private ArrayList<Damage> damages;


    public Car(Engine engine, ArrayList<Tyre> tyres, double price, String colour, String make, String model) {
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
        this.make = make;
        this.model = model;
        this.damages = new ArrayList<>();
    }

    public Engine getEngine() {
        return engine;
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public double getPrice() {
        return price - this.calculateTotalDamage();
    }

    public String getColour() {
        return colour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public ArrayList<Damage> getDamages() {
        return damages;
    }

    public void addDamage(Damage damage) {
        this.damages.add(damage);
//        this.price -= damageCost;
    }

    public void removeDamage(ArrayList<Damage> damages){
        this.damages.removeAll(damages);
    }

    public double calculateTotalDamage(){
        double totalDamage = 0;
        for(Damage damage: this.damages){
            totalDamage += damage.getCostToRepair();
        }
        return totalDamage;
    }
}

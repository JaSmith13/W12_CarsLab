package cars;

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

    public Car(Engine engine, ArrayList<Tyre> tyres, double price, String colour, String make, String model) {
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
        this.make = make;
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public double getPrice() {
        return price;
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
}

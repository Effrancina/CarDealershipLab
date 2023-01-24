package carTypes;

import parts.Engine;
import parts.SteeringWheel;
import parts.Tyre;

public abstract class Car {
    private int price;
    private String colour;
    private Engine engine;
    private Tyre tyre;
    private CarType carType;
    private SteeringWheel steeringWheel;


    public Car(int price, String colour, Engine engine, Tyre tyre, SteeringWheel steeringWheel,CarType carType) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyre = tyre;
        this.steeringWheel = steeringWheel;
        this.carType = carType;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public CarType getCarType() {
        return carType;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }
}

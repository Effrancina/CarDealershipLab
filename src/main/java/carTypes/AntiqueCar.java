package carTypes;

import parts.Engine;
import parts.SteeringWheel;
import parts.Tyre;

public class AntiqueCar extends Car{
    public AntiqueCar(int price, String colour, Engine engine, Tyre tyre, SteeringWheel steeringWheel, CarType carType) {
        super(price, colour, engine, tyre, steeringWheel, carType);
    }
}

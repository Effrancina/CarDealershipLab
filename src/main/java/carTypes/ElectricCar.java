package carTypes;

import behaviours.IChargeable;
import parts.Engine;
import parts.SteeringWheel;
import parts.Tyre;

public class ElectricCar extends Car implements IChargeable {
    private int chargeLevel;

    public ElectricCar(int price, String colour, Engine engine, Tyre tyre, SteeringWheel steeringWheel, CarType carType, int chargeLevel) {
        super(price, colour, engine, tyre, steeringWheel, carType);
        this.chargeLevel = chargeLevel;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }
}

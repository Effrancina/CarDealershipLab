package carTypes;

import parts.Engine;
import parts.SteeringWheel;
import parts.Tyre;

public class Hybrid extends Car{
    private int chargeLevel;
    private int tankLevel;

    public Hybrid(int price, String colour, Engine engine, Tyre tyre, SteeringWheel steeringWheel, CarType carType, int chargeLevel, int tankLevel) {
        super(price, colour, engine, tyre, steeringWheel, carType);
        this.chargeLevel = chargeLevel;
        this.tankLevel = tankLevel;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    public int getTankLevel() {
        return tankLevel;
    }

    public void setTankLevel(int tankLevel) {
        this.tankLevel = tankLevel;
    }
}

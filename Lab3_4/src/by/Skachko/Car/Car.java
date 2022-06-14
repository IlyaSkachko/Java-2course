package by.Skachko.Car;

import java.io.Serializable;

public abstract class Car implements Serializable {

    private int price;
    private float fuelConsumption;
    private int maxSpeed;

    public Car(int price, float fuelConsumption, int maxSpeed) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public Car() {}
    public int getPrice() {
        return price;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void Show();

}

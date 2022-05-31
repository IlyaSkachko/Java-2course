
package com.Lab3.Car;

import com.Lab3.Color.Color;

public class Truck extends Car implements TypeCar {
    private int loadCapacity;
    private final String typeCar = this.TypeCar();

    public Truck(float fuelConsumption, int speed, int cost, Color color, int loadCapacity) {
        super(fuelConsumption, speed, cost, color);
        this.loadCapacity = loadCapacity;
    }

    public int getCapacity() {
        return this.loadCapacity;
    }

    public String TypeCar() {
        return "Тип автомобиля: Грузовой";
    }

    public String toString() {
        String var10000 = this.typeCar;
        return var10000 + super.toString();
    }
}

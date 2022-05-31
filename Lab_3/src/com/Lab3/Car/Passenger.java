//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.Lab3.Car;

import com.Lab3.Color.Color;

public class Passenger extends Car implements TypeCar {
    private int capacity;
    private final String typeCar = this.TypeCar();

    public Passenger(float fuelConsumption, int speed, int cost, Color color, int capacity) {
        super(fuelConsumption, speed, cost, color);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String TypeCar() {
        return "Тип автомобиля: Легковой";
    }

    public String toString() {
        String var10000 = this.typeCar;
        return var10000 + super.toString();
    }
}


package com.Lab3.Car;

import com.Lab3.Color.Color;

public abstract class Car implements TypeCar {
    private int cost;
    private float fuelConsumption;
    private int speed;
    private String color;
    private String typeCar;

    public Car(float fuelConsumption, int speed, int cost, Color color) {
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.cost = cost;
        this.setColor(color);
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public float getFuelConsumption() {
        return this.fuelConsumption;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        switch (color) {
            case BLACK:
                this.color = Color.BLACK.getColor();
                break;
            case RED:
                this.color = Color.RED.getColor();
                break;
            case BLUE:
                this.color = Color.BLUE.getColor();
                break;
            case GREEN:
                this.color = Color.GREEN.getColor();
        }

    }

    public String toString() {
        return " стоимость: " + this.cost + ", расход топлива: " + this.fuelConsumption + ", максимальная скорость: "
                + this.speed + ", цвет: " + this.color + "\n";
    }
}

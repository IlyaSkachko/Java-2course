package by.Skachko.Car;

public abstract class Car {

    private int price;
    private float fuelConsumption;
    private int maxSpeed;

    public Car(int price, float fuelConsumption, int maxSpeed) {
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract void Show();

}

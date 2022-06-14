package by.Skachko.Car;


import java.io.Serializable;

public class Passenger extends Car {

    private TypeCar typeCar;
    public Passenger(int price, float fuelConsumption, int maxSpeed) {
        super(price, fuelConsumption, maxSpeed);
        this.typeCar = TypeCar.PASSENGER;
    }

    public Passenger() {}
    @Override
    public void Show() {
        System.out.println(
                "Price: " + getPrice() +
                        "\nFuel consumption: " + getFuelConsumption() +
                        "\nMaximum speed: " + getMaxSpeed() +
                        "\nType car: " + typeCar + "\n"
        );
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }
}

package by.Skachko.Car;


import java.io.Serializable;

public class Passenger extends Car {

    private TypeCar typeCar;
    public Passenger(int price, float fuelConsumption, int maxSpeed) {
        super(price, fuelConsumption, maxSpeed);
        this.typeCar = TypeCar.PASSENGER;
    }

    public Passenger() {}

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    @Override
    public void Show() {
        System.out.println(
                "Price: " + getPrice() +
                        "\nFuel consumption: " + getFuelConsumption() +
                        "\nMaximum speed: " + getMaxSpeed() +
                        "\nType car: " + typeCar + "\n"
        );
    }

    @Override
    public String toString() {
        return  "Price: " + super.getPrice() +
                "\nFuel consumption: " + super.getFuelConsumption() +
                "\nMaximum speed: " + super.getMaxSpeed() +
                "\nType car: " + typeCar +"\n\n";
    }
}

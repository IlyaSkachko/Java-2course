package by.Skachko.Car;

public class Truck extends Car{

    private TypeCar typeCar;


    public Truck(int price, float fuelConsumption, int maxSpeed) {
        super(price, fuelConsumption, maxSpeed);
        this.typeCar = TypeCar.TRUCK;
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
}

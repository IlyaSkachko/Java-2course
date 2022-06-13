package by.Skachko.Car;


public class Passenger extends Car{

    private TypeCar typeCar;


    public Passenger(int price, float fuelConsumption, int maxSpeed) {
        super(price, fuelConsumption, maxSpeed);
        this.typeCar = TypeCar.PASSENGER;
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

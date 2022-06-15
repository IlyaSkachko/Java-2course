package by.Skachko.Car;

public class Truck extends Car{

    private TypeCar typeCar;


    public Truck(int price, float fuelConsumption, int maxSpeed) {
        super(price, fuelConsumption, maxSpeed);
        this.typeCar = TypeCar.TRUCK;
    }

    public Truck() {}


    public TypeCar getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
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


package com.Lab3.TaxiCompany;

import com.Lab3.Car.Car;
import java.util.Arrays;

public class Manager {
    private static final Taxi company = new Taxi();
    private static Car[] cars;

    public Manager() {
    }

    public static Car[] getCars() {
        return cars;
    }

    public static int CostPark() {
        int costPark = 0;
        Car[] var1 = cars;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Car car = var1[var3];
            costPark += car.getCost();
        }

        return costPark;
    }

    public static void Sort() throws IndexOutOfBoundsException {
        float[] arr = new float[cars.length];

        for(int i = 0; i < cars.length; ++i) {
            arr[i] = cars[i].getFuelConsumption();
        }

        Arrays.sort(arr);
        Car[] carSort = new Car[cars.length];

        for(int i = 0; i < cars.length; ++i) {
            for(int j = 0; j < cars.length; ++j) {
                if (arr[i] == cars[j].getFuelConsumption()) {
                    carSort[i] = cars[j];
                }
            }
        }

        cars = (Car[])carSort.clone();
    }

    public static String SearchSpeed(int begin, int end) throws NullPointerException {
        Car car1 = null;
        Car[] var3 = cars;
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Car car = var3[var5];
            if (car.getSpeed() > begin && car.getSpeed() < end) {
                return car.toString();
            }
        }

        return ((Car)car1).toString();
    }

    static {
        cars = company.getTaxi();
    }
}

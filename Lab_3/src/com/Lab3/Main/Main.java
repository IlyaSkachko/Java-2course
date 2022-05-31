
package com.Lab3.Main;

import com.Lab3.Car.Car;
import com.Lab3.TaxiCompany.Manager;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Car[] var1 = Manager.getCars();
        int var2 = var1.length;

        int var3;
        Car car;
        for(var3 = 0; var3 < var2; ++var3) {
            car = var1[var3];
            System.out.println(car.toString());
        }

        System.out.println("\n\nОбщая стоимость автопарка: " + Manager.CostPark() + "\n\n");

        try {
            Manager.Sort();
        } catch (IndexOutOfBoundsException var6) {
            System.out.println(var6.getMessage());
        }

        var1 = Manager.getCars();
        var2 = var1.length;

        for(var3 = 0; var3 < var2; ++var3) {
            car = var1[var3];
            System.out.println(car.toString());
        }

        try {
            System.out.println("\n Автомобиль с указаным диапозон скорости: " + Manager.SearchSpeed(200, 230));
        } catch (NullPointerException var5) {
            System.out.println("Такого автомобиля нет! ");
        }

    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.Lab3.TaxiCompany;

import com.Lab3.Car.Car;
import com.Lab3.Car.Passenger;
import com.Lab3.Car.Truck;
import com.Lab3.Color.Color;
import java.util.Random;

public class Taxi {
    private Car[] taxi = new Car[10];

    public Taxi() {
        String[] colors = new String[]{"GREEN", "RED", "BLACK", "BLUE"};

        for(int i = 0; i < 10; ++i) {
            String color;
            if (Math.round(Math.random()) == 1L) {
                color = colors[(new Random()).nextInt(0, 4)];
                this.taxi[i] = new Passenger((new Random()).nextFloat(6.0F, 10.0F),
                                (new Random()).nextInt(180, 240),
                                (new Random()).nextInt(4000, 10000),
                                Color.valueOf(color), (new Random()).nextInt(3, 8));
            } else {
                color = colors[(new Random()).nextInt(0, 4)];
                this.taxi[i] = new Truck((new Random()).nextFloat(14.0F, 25.0F),
                                (new Random()).nextInt(100, 140),
                                (new Random()).nextInt(15000, 25000),
                                Color.valueOf(color), (new Random()).nextInt(100, 20000));
            }
        }

    }

    public Car[] getTaxi() {
        return this.taxi;
    }
}

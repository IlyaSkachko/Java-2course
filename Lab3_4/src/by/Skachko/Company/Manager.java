package by.Skachko.Company;

import by.Skachko.Car.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class Manager {

    private ArrayList<Car> list;


    public int PricePark(TaxiCompany company) {
        int price = 0;
        for (var car : company.getList()) {
            price += car.getPrice();
        }
        return price;
    }

    public void Sort(TaxiCompany company){
        Car[] cars;
        float[] arr = new float[company.getCount()];

        for(int i = 0; i < company.getCount(); ++i) {
            arr[i] = company.getList().get(i).getFuelConsumption();
        }

        Arrays.sort(arr);
        Car[] carSort = new Car[company.getCount()];

        for(int i = 0; i < company.getCount(); ++i) {
            for(int j = 0; j < company.getCount(); ++j) {
                if (arr[i] == company.getList().get(j).getFuelConsumption()) {
                    carSort[i] = company.getList().get(j);
                }
            }
        }

        cars = carSort.clone();
        ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i <cars.length; i++) {
            list.add(i, cars[i]);
        }
        company.setList(list);

    }

    public void SearchSpeed(TaxiCompany company, int begin, int end) {
        for (var car : company.getList()) {
            if (car.getMaxSpeed() >= begin && car.getMaxSpeed() <= end) {
                car.Show();
            }
        }
    }

}

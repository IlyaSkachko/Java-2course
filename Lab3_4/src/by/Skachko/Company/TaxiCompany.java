package by.Skachko.Company;

import by.Skachko.Car.Car;
import by.Skachko.Car.Passenger;
import by.Skachko.Exception.AddException;

import java.util.ArrayList;

public class TaxiCompany {

    private ArrayList<Car> list;
    private int count = 0;
    private final int maxCount;

    public TaxiCompany(int maxCount) {
        this.maxCount = maxCount;
        list = new ArrayList<>();
    }

    public void AddCar(Car car) throws AddException {
        if (count < maxCount) {
            list.add(car);
            count++;
        }
        else
            throw new AddException("Company is full", count);
    }

    public ArrayList<Car> getList() {
        return list;
    }

    protected void setList(ArrayList<Car> list) {
        this.list = list;
    }

    public void Show() {
        for(var i : list) {
            i.Show();
        }
    }

    public int getCount() {
        return count;
    }
}

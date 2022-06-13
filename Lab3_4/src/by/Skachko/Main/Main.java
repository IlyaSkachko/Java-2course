package by.Skachko.Main;

import by.Skachko.Car.Passenger;
import by.Skachko.Car.Truck;
import by.Skachko.Company.Manager;
import by.Skachko.Company.TaxiCompany;
import by.Skachko.Exception.AddException;

public class Main {
    public static void main(String[] args) {
        try {
            TaxiCompany company = new TaxiCompany(5);
            company.AddCar(new Passenger(4500, 6.7f, 212));
            company.AddCar(new Truck(15000, 14.5f, 150));
            company.AddCar(new Passenger(7500, 9.2f, 190));
            company.AddCar(new Passenger(10000, 12.5f, 242));
            company.AddCar(new Truck(95000, 35.5f, 120));

            System.out.println("\n\n------ Park ------");
            company.Show();
            System.out.println("\n\n------ Price Park ------");
            Manager manager = new Manager();
            System.out.println(manager.PricePark(company));
            System.out.println("\n\n\n");
            System.out.println("\n\n------ Sort Park ------");
            manager.Sort(company);
            company.Show();
            System.out.println("\n\n------ Max Speed in the range------");
            manager.SearchSpeed(company, 100, 150);

        }
        catch (AddException ex) {

        }
    }
}

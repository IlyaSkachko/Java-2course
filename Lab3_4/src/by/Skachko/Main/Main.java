package by.Skachko.Main;

import by.Skachko.Car.Passenger;
import by.Skachko.Car.Truck;
import by.Skachko.Company.Manager;
import by.Skachko.Company.TaxiCompany;
import by.Skachko.Exception.AddException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {

    static {
        new DOMConfigurator().doConfigure("log/log4j.xml", LogManager.getLoggerRepository());
    }
    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            LOG.info("Starting program");

            TaxiCompany company = new TaxiCompany(5);
            company.AddCar(new Passenger(4500, 6.7f, 212));
            company.AddCar(new Truck(15000, 14.5f, 150));
            company.AddCar(new Passenger(7500, 9.2f, 190));
            company.AddCar(new Passenger(10000, 12.5f, 242));
            company.AddCar(new Truck(95000, 35.5f, 120));
            LOG.info("Company created");

            System.out.println("\n\n------ Park ------");
            company.Show();

            System.out.println("\n\n------ Price Park ------");
            Manager manager = new Manager();
            System.out.println(manager.PricePark(company));
            LOG.info("The cost calculation is completed");

            System.out.println("\n\n------ Sort Park ------");
            manager.Sort(company);
            company.Show();
            LOG.info("List is sorted");

            System.out.println("\n\n------ Max Speed in the range------");
            manager.SearchSpeed(company, 100, 150);


        }
        catch (AddException ex) {

        }
    }
}

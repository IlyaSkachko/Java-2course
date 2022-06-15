package by.Skachko.Main;

import by.Skachko.Car.Car;
import by.Skachko.Car.Passenger;
import by.Skachko.Car.Truck;
import by.Skachko.Company.Manager;
import by.Skachko.Company.TaxiCompany;
import by.Skachko.Exception.AddException;

import by.Skachko.parser.Sax;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.Scanner;


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


            System.out.println("\n\n--------- XML Serialize ------------");
            XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("files/info.xml")));
            xmlEncoder.writeObject(company.getList().get(2));
            xmlEncoder.close();
            LOG.info("XML Serialized");


            System.out.println("\n\n--------- XML Deserialize ------------");
            XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream("files/info.xml"));
            Car car = (Car)xmlDecoder.readObject();
            xmlDecoder.close();
            car.Show();
            LOG.info("XML Deserialized");


            System.out.println("\n\n--------- JSON Serialize ------------");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(company.getList().get(0));
            System.out.println(json);
            FileOutputStream jsonOut = new FileOutputStream("files/info.json");
            byte[] outText = json.getBytes(StandardCharsets.UTF_8);
            jsonOut.write(outText, 0, outText.length);
            LOG.info("JSON Serialized");


            System.out.println("\n\n--------- JSON Deserialize ------------");
            Scanner scanner = new Scanner(new File("files/info.json"));
            StringBuilder result = new StringBuilder();
            while(scanner.hasNext()) {
                result.append(scanner.nextLine());
            }
            scanner.close();
            gson.fromJson(result.toString(), Truck.class).Show();
            LOG.info("JSON Deserialized");


            System.out.println("\n\n------------ Stream API --------------");
            company.getList().stream().filter(s -> s.getPrice() > 10000).forEach(s -> System.out.println(s));
            LOG.info("Stream API");


            System.out.println("\n\n------------ SAX --------------");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            Sax sax = new Sax();
            parser.parse(new File("files/Passenger.xml"), sax);
            Passenger passenger = sax.getResult();
            passenger.Show();
            LOG.info("SAX");

        }
        catch (AddException ex) {
            LOG.info(ex.getMessage() + " (" + ex.number + ")");
        }
        catch (IOException | RuntimeException | SAXException | ParserConfigurationException ex ) {
            ex.printStackTrace();
        }
        finally {
            LOG.info("Finally block\n");
        }

    }

}

package by.Skachko.parser;


import by.Skachko.Car.Passenger;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class Sax extends DefaultHandler {

    Passenger passenger = new Passenger(4500, 6.5f, 178);
    private String thisElement = "";

    public Passenger getResult()
    {
        return passenger;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        thisElement = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        thisElement = "";
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (thisElement.equals("price")) {
            passenger.setPrice(Integer.parseInt(new String(ch, start, length)));
        }
        if (thisElement.equals("fuelConsumption")) {
            passenger.setFuelConsumption(Float.parseFloat(new String(ch, start, length)));
        }
        if (thisElement.equals("maxSpeed")) {
            passenger.setMaxSpeed(Integer.parseInt(new String(ch, start, length)));
        }
    }
}

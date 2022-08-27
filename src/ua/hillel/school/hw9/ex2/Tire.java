package ua.hillel.school.hw9.ex2;

public class Tire {

    private String producer; //Yokohama, Michelin, Toyo, itc
    private String collection;
    private String season; //Winter, Summer, Demi-season
    private int diameter; //inches
    private String typeProfile; //high, low
    private String equipment; //studded rubber, stick for iced road
    private double price; //price

    public Tire(String producer, String collection, String season, int diameter, String typeProfile, String equipment, double price) {
        this.producer = producer;
        this.collection = collection;
        this.season = season;
        this.diameter = diameter;
        this.typeProfile = typeProfile;
        this.equipment = equipment;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public String getCollection() {
        return collection;
    }

    public String getSeason() {
        return season;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getTypeProfile() {
        return typeProfile;
    }

    public String getEquipment() {
        return equipment;
    }

    public double getPrice() {
        return price;
    }

}
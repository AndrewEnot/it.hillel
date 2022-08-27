package ua.hillel.school.hw9.ex2;

public class Disc {

    private String producer; //K&K, BBS, AEZ, DOTZ, itc
    private String collection;
    private int diameter; //inches
    private double price; //price

    public Disc(String producer, String collection, int diameter, double price) {
        this.producer = producer;
        this.collection = collection;
        this.diameter = diameter;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public String getCollection() {
        return collection;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getPrice() {
        return price;
    }
}

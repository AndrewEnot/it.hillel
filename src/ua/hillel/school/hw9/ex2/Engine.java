package ua.hillel.school.hw9.ex2;

public class Engine {

    private String producer;
    private String model;
    private String fuel;
    private double volume;
    private String type;
    private double price;

    public Engine(String producer, String model, String fuel, double volume, String type, double price) {
        this.producer = producer;
        this.model = model;
        this.fuel = fuel;
        this.volume = volume;
        this.type = type;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public String getFuel() {
        return fuel;
    }

    public double getVolume() {
        return volume;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}

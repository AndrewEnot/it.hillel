package ua.hillel.school.hw9.ex2;

public class Transmission {

    private String producer;
    private String model;
    private String type;
    private int gearsNumForward;
    private int gearsNumBack;
    private double price;

    public Transmission(String producer, String model, String type, int gearsNumForward, int gearsNumBack, double price) {
        this.producer = producer;
        this.model = model;
        this.type = type;
        this.gearsNumForward = gearsNumForward;
        this.gearsNumBack = gearsNumBack;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getGearsNumForward() {
        return gearsNumForward;
    }

    public int getGearsNumBack() {
        return gearsNumBack;
    }

    public double getPrice() {
        return price;
    }
}

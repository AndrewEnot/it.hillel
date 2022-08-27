package ua.hillel.school.hw9.ex2;

public class SoundSystem {

    private String brand;
    private String model;
    private int columns;
    private boolean subwoofer;
    private boolean bass;
    private double price;

    public SoundSystem(String brand, String model, int columns, boolean subwoofer, boolean bass, double price) {
        this.brand = brand;
        this.model = model;
        this.columns = columns;
        this.subwoofer = subwoofer;
        this.bass = bass;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getColumns() {
        return columns;
    }

    public boolean isSubwoofer() {
        return subwoofer;
    }

    public boolean isBass() {
        return bass;
    }

    public double getPrice() {
        return price;
    }
}

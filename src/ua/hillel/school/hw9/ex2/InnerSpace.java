package ua.hillel.school.hw9.ex2;

public class InnerSpace {

    private String material1;
    private String material2;
    private boolean lights;
    private double price;

    public InnerSpace(String material1, String material2, boolean lights, double price) {
        this.material1 = material1;
        this.material2 = material2;
        this.lights = lights;
        this.price = price;
    }

    public String getMaterial1() {
        return material1;
    }

    public String getMaterial2() {
        return material2;
    }

    public boolean isLights() {
        return lights;
    }

    public double getPrice() {
        return price;
    }
}

package ua.hillel.school.hw10;

public class Pizza {

    private Circle basis;
    private String composition;
    private String name;
    private double price;
    private double diameter;

    //конструктор класу Pizza
    public Pizza(String composition, String name, double price, double diameter ) {
        this.composition = composition;
        this.name = name;
        this.price = price;
        this.diameter = diameter;
        basis = new Circle(diameter/2);
    }

    //геттери та сеттери

    public Circle getBasis() {
        return basis;
    }

    public void setBasis(Circle basis) {
        this.basis = basis;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}

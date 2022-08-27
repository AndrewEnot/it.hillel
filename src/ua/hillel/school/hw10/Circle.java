package ua.hillel.school.hw10;

public class Circle {

    private double radius;
    private double circuit;
    private double area;
    private String colour;

    //конструктор класу за радусом - видає ряд похідних даних - довжина кола (circuit) та площа кола (area)

    public Circle(double radius) {
        this.radius = radius;
        circuit = 2 * (radius * Math.PI);
        area = (radius*radius) * Math.PI;
    }

    //конструктор класу за радіусом та кольором - видає ряд похідних даних - колір (colour)

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    //геттери та сеттери

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircuit() {
        return circuit;
    }

    public void setCircuit(double circuit) {
        this.circuit = circuit;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

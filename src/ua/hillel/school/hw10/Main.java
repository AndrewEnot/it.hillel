package ua.hillel.school.hw10;

public class Main {

    public static void main(String[] args) {

        //метод генерує екземпляри класу Circle(), на основі радіусу користуючись першим конструктором Circle(radius)
        //щоб окремо ініціалізувати дані кольору використовуємо cеттер, або задовільняємось показником null

        Circle circle = new Circle(18);
        circle.setColour("brown");
        System.out.println("radius " + circle.getRadius());
        System.out.println("area " + circle.getArea());
        System.out.println("circuit " + circle.getCircuit());
        System.out.println("colour " + circle.getColour());
    }
}

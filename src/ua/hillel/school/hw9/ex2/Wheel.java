package ua.hillel.school.hw9.ex2;


public class Wheel {

    private Tire tire;
    private Disc disc;

    public Wheel(Tire tire, Disc disc) {
        this.tire = tire;
        this.disc = disc;
    }

    //метод для розрахунку ціни комплекта одного колеса
    public double WheelPrice () {
        return tire.getPrice()+ disc.getPrice();
    }

    public Tire getTire() {
        return tire;
    }

    public Disc getDisc() {
        return disc;
    }
}

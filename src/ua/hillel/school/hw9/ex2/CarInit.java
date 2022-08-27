package ua.hillel.school.hw9.ex2;

public class CarInit {

    public static void main(String[] args) {

        //блок ініціювання та введення даних щодо джвигуна автомобіля
        Engine engine1 = new Engine("BMW", "M20", "gas", 1800,
                "injection", 35000);

        //блок введення даних щодо коліс автомобіля
        Disc disc1 = new Disc("AEZ", "Dust", 18, 1500);
        Tire tire1 = new Tire("Nokian", "Hakkapilita", "winter", 18,
                "high", null, 500);
        Wheel wheelFwRight = new Wheel(tire1,disc1);
        Wheel wheelFwLeft = new Wheel(tire1, disc1);
        Wheel wheelBackRight = new Wheel(tire1, disc1);
        Wheel wheelBackLeft = new Wheel(tire1, disc1);
        Wheel[] wheels = {wheelBackLeft, wheelBackRight, wheelFwLeft, wheelFwRight};

        //блок ведення даних щодо трансмісії
        Transmission transmission1 = new Transmission("BMW", "M3 F20", "auto",
                5, 2, 10000);

        //блок введення даних щодо оздоблення салону, клас InnerSpace
        InnerSpace interior = new InnerSpace("дуб", "штучне золото",true,25000);

        //блок ведення даних щодо звукової системи
        SoundSystem sound1 = new SoundSystem("Bang & Olafson", "SuperBass", 8,
                true, true, 15000);

        //ініціалізація класу та створення обьекту Авто (класу - Car)
        Car firstCar = new Car("BMW", "M5", "Alpina", 2020);
        firstCar.setWheels(wheels);
        firstCar.setEngine(engine1);
        firstCar.setTransmissions(transmission1);
        firstCar.setInnerSpace(interior);
        firstCar.setSoundSystem(sound1);
        firstCar.CarInfo();
    }
}

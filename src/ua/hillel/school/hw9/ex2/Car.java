package ua.hillel.school.hw9.ex2;

public class Car {

    private final String brand;
    private final String model;
    private final String modification;
    private final double year;
    private Wheel[] wheels;
    private Engine engine;
    private InnerSpace innerSpace;
    private SoundSystem soundSystem;
    private Transmission transmissions;

    public Car(String brand, String model, String modification, double year) {
        this.brand = brand;
        this.model = model;
        this.modification = modification;
        this.year = year;
    }

    //метод для розрахунку орієнтовної вартості виходячі з цін комплектуючих частин
    public double CarPrice (){
        double wheelsPrice = 0;
        for (Wheel wheel : wheels) {
            wheelsPrice += wheel.WheelPrice();
        }
        return wheelsPrice + engine.getPrice() + transmissions.getPrice() + soundSystem.getPrice() +
                innerSpace.getPrice();
    }

    //метод Info для відображення данних щодо ініціалізованого Авто
    public void CarInfo (){
        System.out.println("Бренд  : " + this.brand);
        System.out.println("Модель : " + this.model);
        System.out.println("Модифікація : " + this.modification);
        System.out.println("Рік випуску : " + this.year);
        System.out.println(" ");
        System.out.println("Двигун : " + engine.getProducer() + " " + engine.getModel() + " " + engine.getType() +
                " " + engine.getFuel() + " об'єм - " + engine.getVolume() + " см3");
        System.out.println(" ");
        System.out.println("Трансмісія : " + transmissions.getProducer() + " " + transmissions.getModel()
                + " тип " + transmissions.getType() + " передніх передач "  + transmissions.getGearsNumForward()
                + " та задніх " + transmissions.getGearsNumBack());
        System.out.println(" ");
        System.out.println("Колеса:");
        System.out.println("    диски");
        for (Wheel wheel : wheels) {
            System.out.println("        " + wheel.getDisc().getProducer() + " " + wheel.getDisc().getCollection()
                    + " " + wheel.getDisc().getDiameter());
        }
        System.out.println("    покришки");
        for (Wheel wheel : wheels) {
            System.out.println("        " + wheel.getTire().getProducer() + " " + wheel.getTire().getCollection()
                    + " " + wheel.getTire().getDiameter() + " " + wheel.getTire().getSeason() + " "
                    + wheel.getTire().getTypeProfile() + " " + wheel.getTire().getEquipment());
        }
        System.out.println(" ");
        System.out.println("Звук : " + soundSystem.getBrand() + " " + soundSystem.getModel() + " "
                + soundSystem.getColumns() + " колонок наявність басів(" + soundSystem.isBass() + ") та сабвуферу ("
                + soundSystem.isSubwoofer() + ")");
        System.out.println(" ");
        System.out.println("Внтурішнє оздоблення:");
        System.out.println("    матеріал 1 : " + innerSpace.getMaterial1());
        System.out.println("    матеріал 2 : " + innerSpace.getMaterial2());
        System.out.println("    наявність підсвітки : " + innerSpace.isLights());
        System.out.println(" ");
        System.out.println("Орієнтовна ринкова вартість: " + CarPrice() + " $  !!!!!!! ");
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setInnerSpace(InnerSpace innerSpace) {
        this.innerSpace = innerSpace;
    }

    public void setSoundSystem(SoundSystem soundSystem) {
        this.soundSystem = soundSystem;
    }

    public void setTransmissions(Transmission transmissions) {
        this.transmissions = transmissions;
    }
}

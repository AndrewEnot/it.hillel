package ua.hillel.school.hw14;

public class Oven extends Multicooker {

    public Oven(String name, long serialNumber) {
        setName(name);
        setSerialNumber(serialNumber);
    }

    void initTimer(int time) {
        if (isPowerOn()) {
            System.out.println("You chose " + time + " for cooking");
        } else {
            System.out.println("The Oven is off!");
        }
    }

    @Override
    void cook() {
        if (isPowerOn()) {
            System.out.println("Open the door...");
            System.out.println("Put inside box with the ingredients...");
        } else {
            System.out.println("The Oven is off!");
        }
    }

    @Override
    void infoDevice() {
        System.out.println("Name: " + getName() + " Serial number: " + getSerialNumber());
    }
}

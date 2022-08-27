package ua.hillel.school.hw14;

public class MulticookerDevice extends Multicooker {

    public MulticookerDevice(String name, long serialNumber) {
        setName(name);
        setSerialNumber(serialNumber);
    }

    void switchProgram(int codeProgram) {
        if (isPowerOn()) {
            switch (codeProgram) {
                case 0 -> System.out.println("Fried potatoes");
                case 1 -> System.out.println("Making rice");
                case 2 -> System.out.println("Soup");
                case 3 -> System.out.println("Buckwheat");
                default -> System.out.println("    Unknown dish!!!");
            }
        } else {
            System.out.println("The Multicooker is off!");
        }
    }

    @Override
    void cook() {
        if (isPowerOn()) {
            System.out.println("Open the door...");
            System.out.println("Put inside box with the ingredients...");
        } else {
            System.out.println("The Multicooker is off!");
        }
    }

    @Override
    void infoDevice() {
        System.out.println("Name: " + getName() + " Serial number: " + getSerialNumber());
    }
}

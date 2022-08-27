package ua.hillel.school.hw14;

public class SmartPhone extends MobilePhone {

    String oS;

    public SmartPhone(String name, long serialNumber, int simCount, double displaySize, String oS) {
        super(name, serialNumber, simCount, displaySize);
        this.oS = oS;
    }

    void runApp(String nameApp) {
        if (isPowerOn()) {
            System.out.println("You open menu...");
            System.out.println("You chose App: " + nameApp);
        } else {
            System.out.println("The phone is off!");
        }
    }
    @Override
    void infoDevice() {
        System.out.println("Name: " + getName() + " Serial number: " + getSerialNumber() +
                " SimCard Count: " + getSimCount() + " Display Size: " + getDisplaySize() + " Operating System: " + oS);
    }
}

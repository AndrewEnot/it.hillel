package ua.hillel.school.hw14;

public class MobilePhone extends Phone {

    private int simCount;
    private double displaySize;

    public int getSimCount() {
        return simCount;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public MobilePhone(String name, long serialNumber, int simCount, double displaySize) {
        this.simCount = simCount;
        this.displaySize = displaySize;
        setName(name);
        setSerialNumber(serialNumber);
    }

    @Override
    void powerOn() {
        System.out.println("Push on the button until display lights up...");
        setPowerOn(true);
        System.out.println("Phone is on!!!");
    }

    @Override
    void powerOff() {
        System.out.println("Push on the button until display goes blank...");
        setPowerOn(false);
        System.out.println("Phone is off!!!");
    }

    @Override
    void call(long numberPhone) {
        if (isPowerOn()) {
            System.out.println("Push on display button 'PHONE'");
            System.out.println("Dialing number: " + numberPhone);
            System.out.println("Choosing SimCard");
            System.out.println("Talking on the phone...");
            System.out.println("Hanging up!");
        } else {
            System.out.println("Phone is off");
        }
    }

    @Override
    void infoDevice() {
        System.out.println("Name: " + getName() + " Serial number: " + getSerialNumber() +
                " SimCard Count: " + simCount + " Display Size: " + displaySize);
    }
}

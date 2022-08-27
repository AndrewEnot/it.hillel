package ua.hillel.school.hw14;

abstract class AbstractDevice {

    private String name;
    private long serialNumber;
    private boolean isPowerOn;


    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public AbstractDevice() {
        powerOn();
    }

    abstract void infoDevice();

    abstract void powerOn();

    abstract void powerOff();
}

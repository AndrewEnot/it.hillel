package ua.hillel.school.hw14;

public class DialPhone extends Phone {

    private boolean hasAnswerPhone;

    public DialPhone(String name, long serialNumber, boolean hasAnswerPhone) {
        this.hasAnswerPhone = hasAnswerPhone;
        setName(name);
        setSerialNumber(serialNumber);
    }
    void autoAnswer(int command) {
        if (isPowerOn() && hasAnswerPhone) {
            System.out.println("Your Autoanswer is working!");
            switch (command) {
                case 0 -> System.out.println("Skip listening...");
                case 1 -> System.out.println("Listening...");
                case 9 -> System.out.println("Erasing all records...");
                default -> System.out.println("    Unknown command!!!");
            }
        } else {
            System.out.println("Your Autoanswer is NOT working!");
        }
    }
    @Override
    void powerOn() {
        System.out.println("You put the wire to the outlet...");
        setPowerOn(true);
    }

    @Override
    void powerOff() {
        System.out.println("You disconnect the wire from the outlet...");
        setPowerOn(false);
    }

    @Override
    void call(long numberPhone) {
        System.out.println("Picking up the handset...");
        if (isPowerOn()) {
            System.out.println("Dialing number: " + numberPhone);
            System.out.println("Talking on the phone...");
            System.out.println("Hanging up!");
        } else {
            System.out.println("Phone is off");
        }
    }

    @Override
    void infoDevice() {
        System.out.println("Name: " + getName() + " Serial number: " + getSerialNumber() +
                " Autoanswer: " + hasAnswerPhone);
    }
}

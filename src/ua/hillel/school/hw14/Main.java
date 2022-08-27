package ua.hillel.school.hw14;

public class Main {

    public static void main(String[] args) {

        DialPhone newDialPhone = new DialPhone("Samsung Phone 2000", 123456789, true);
        newDialPhone.infoDevice();
        newDialPhone.autoAnswer(1);
        newDialPhone.call(637137744);
        newDialPhone.powerOff();
        System.out.println("\s");
        newDialPhone.call(934603393);
        System.out.println("\s");

        MobilePhone newMobilePhone = new MobilePhone("Iphone X", 987654321, 1, 5.5);
        newMobilePhone.infoDevice();
        newMobilePhone.call(637137744);
        newMobilePhone.powerOff();
        System.out.println("\s");

        SmartPhone newSmartPhone = new SmartPhone("Huawei", 456123789, 2, 5.5,
                "Android");
        newSmartPhone.infoDevice();
        newSmartPhone.call(637137744);
        newSmartPhone.runApp("Google Maps");
        newSmartPhone.powerOff();
        System.out.println("\s");

        MulticookerDevice newMulticooker = new MulticookerDevice("Philips", 123789456);
        newMulticooker.infoDevice();
        newMulticooker.switchProgram(3);
        newMulticooker.cook();
        newMulticooker.powerOff();
        System.out.println("\s");

        Oven newOven = new Oven("Candy", 987456321);
        newOven.infoDevice();
        newOven.initTimer(5);
        newOven.cook();
        newOven.powerOff();
    }
}
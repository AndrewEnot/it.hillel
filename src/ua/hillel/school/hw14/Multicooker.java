package ua.hillel.school.hw14;

import java.sql.SQLOutput;

abstract class Multicooker extends AbstractDevice {

    abstract void cook();

    @Override
    void powerOff() {
        System.out.println("Push on the button 'ON' until lights off...");
        System.out.println("You disconnect the wire from the outlet...");
        setPowerOn(false);
    }

    @Override
    void powerOn() {
        System.out.println("You put the wire to the outlet...");
        System.out.println("Push on the button 'ON' until lights on...");
        setPowerOn(true);
    }
}


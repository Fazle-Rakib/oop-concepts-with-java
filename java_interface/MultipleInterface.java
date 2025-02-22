package java_interface;

interface PowerControl {
    void turnOn();
    void turnOff();
}

interface Adjustable {
    void adjust(int level);
}

class SmartBulb1 implements PowerControl, Adjustable {
    public void turnOn() {
        System.out.println("Smart Bulb is turned ON.");
    }

    public void turnOff() {
        System.out.println("Smart Bulb is turned OFF.");
    }

    public void adjust(int brightness) {
        System.out.println("Smart Bulb brightness set to " + brightness);
    }
}

class SmartFan1 implements PowerControl, Adjustable {
    public void turnOn() {
        System.out.println("Smart Fan is turned ON.");
    }

    public void turnOff() {
        System.out.println("Smart Fan is turned OFF.");
    }

    public void adjust(int speed) {
        System.out.println("Smart Fan speed set to " + speed);
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        SmartBulb1 bulb = new SmartBulb1();
        bulb.turnOn();
        bulb.adjust(5);
        bulb.turnOff();

        SmartFan1 fan = new SmartFan1();
        fan.turnOn();
        fan.adjust(3);
        fan.turnOff();
    }
}
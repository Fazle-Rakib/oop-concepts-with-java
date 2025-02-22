package java_interface;

class SmartBulb {
    void turnOn() {
        System.out.println("Smart Bulb is turned ON.");
    }
    void turnOff() {
        System.out.println("Smart Bulb is turned OFF.");
    }
    void adjustBrightness(int level) {
        System.out.println("Smart Bulb brightness set to " + level);
    }
}

class SmartFan {
    void turnOn() {
        System.out.println("Smart Fan is turned ON.");
    }
    void turnOff() {
        System.out.println("Smart Fan is turned OFF.");
    }
    void adjustSpeed(int speed) {
        System.out.println("Smart Fan speed set to " + speed);
    }
}

public class WithoutMultipleInterface {
    public static void main(String[] args) {
        SmartBulb bulb = new SmartBulb();
        bulb.turnOn();
        bulb.adjustBrightness(5);
        bulb.turnOff();

        SmartFan fan = new SmartFan();
        fan.turnOn();
        fan.adjustSpeed(3);
        fan.turnOff();
    }
}

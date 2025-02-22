package java_interface;

interface PowerControlInterface {
    void turnOn();
    void turnOff();
}

interface AdjustableInterface {
    void adjust(int level);
}

// SmartDevice wants PowerControl (inherits its methods)
// and also to show device info
interface SmartDevice extends PowerControlInterface {
    void deviceInfo();
}

class SmartLock implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart Lock is activated.");
    }

    public void turnOff() {
        System.out.println("Smart Lock is deactivated.");
    }
    public void deviceInfo() {
        System.out.println("Smart lock");
    }
}

class SmartFan2 implements PowerControlInterface, AdjustableInterface {
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

public class ExtendingInterface {
    public static void main(String[] args) {
        SmartLock lock = new SmartLock();
        lock.turnOn();
        lock.turnOff();
        lock.deviceInfo();

//        SmartFan2 fan = new SmartFan2();
//        fan.turnOn();
//        fan.adjust(3);
//        fan.turnOff();
//        fan.deviceInfo();
    }
}
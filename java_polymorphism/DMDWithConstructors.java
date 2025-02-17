package java_polymorphism;

class SmartDevice2 {
    SmartDevice2() {
        System.out.println("SmartDevice initialized...");
    }

    void operate() {
        System.out.println("Operating a generic smart device...");
    }
}

class SmartLight2 extends SmartDevice2 {
    SmartLight2() {
        System.out.println("SmartLight initialized...");
    }

    @Override
    void operate() {
        System.out.println("Turning on/off the smart light...");
    }
}

public class DMDWithConstructors {
    public static void main(String[] args) {
        SmartDevice2 device = new SmartLight2();
        device.operate();
    }
}


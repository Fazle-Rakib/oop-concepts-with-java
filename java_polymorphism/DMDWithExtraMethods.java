package java_polymorphism;

class SmartDevice1 {
    void operate() {
        System.out.println("Operating a generic smart device...");
    }
}

class SmartLight1 extends SmartDevice1 {
    @Override
    void operate() {
        System.out.println("Turning on/off the smart light...");
    }

    void dimLight() {
        System.out.println("Dimming the smart light...");
    }
}

class SmartThermostat1 extends SmartDevice1 {
    @Override
    void operate() {
        System.out.println("Adjusting temperature on smart thermostat...");
    }

    void setTemperature(int temp) {
        System.out.println("Setting thermostat to " + temp + "°C.");
    }
}

public class DMDWithExtraMethods {
    public static void main(String[] args) {
        SmartDevice1 device;

        device = new SmartLight1();
        device.operate();
//        device.dimLight(); // ❌ This will cause a compile-time error

        device = new SmartThermostat1();
        device.operate();
        // device.setTemperature(22); // ❌ This will also cause a compile-time error
    }
}

// How can we solve it?(down-casting)


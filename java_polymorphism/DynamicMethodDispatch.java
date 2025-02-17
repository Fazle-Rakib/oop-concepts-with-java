package java_polymorphism;

class SmartDevice {
    void operate() {
        System.out.println("Operating a generic smart device...");
    }
}

class SmartLight extends SmartDevice {
    @Override
    void operate() {
        System.out.println("Turning on/off the smart light...");
    }
}

class SmartThermostat extends SmartDevice {
    @Override
    void operate() {
        System.out.println("Adjusting temperature on smart thermostat...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        SmartDevice device; // Parent reference | reference variable

        device = new SmartLight(); // Assign SmartLight object | obj reference
        device.operate(); // Calls SmartLight's operate() method

        device = new SmartThermostat(); // Assign SmartThermostat object
        device.operate(); // Calls SmartThermostat's operate() method
    }
}


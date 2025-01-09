package java_class_concepts;

class Lamp {
    // field
    boolean isOn = false;

    // method to turn on the light
    void turnOn() {
        isOn = true;
    }

    // method to turnoff the light
    void turnOff() {
        isOn = false;
    }
}

public class IntroductionToClass {
    public static void main(String[] args) {

        // create objects led and halogen
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        System.out.println("Led isOn state: " + led.isOn);
        System.out.println("halogen isOn state: " + halogen.isOn);

        // turn on the light by
        // calling method turnOn()
        led.turnOn();
        System.out.println("After Led executes turnOn():");
        System.out.println("Led isOn state: " + led.isOn);
        System.out.println("halogen isOn state: " + halogen.isOn);

        // turn off the light by
        // calling method turnOff()
        halogen.turnOn();
    }
}
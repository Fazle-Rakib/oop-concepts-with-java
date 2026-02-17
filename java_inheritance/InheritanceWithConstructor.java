package java_inheritance;

class Vehicle1 {
    private String engineType;
    Vehicle1() { System.out.println("Vehicle1 default constructor"); }
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car1 extends Vehicle1 {
    Car1() { System.out.println("Car1 default constructor!"); }
    void accelerate() {
        System.out.println("Car is accelerating...");
    }
}

public class InheritanceWithConstructor {
    public static void main(String[] args) {
        Car1 toyotaCHr = new Car1();
        toyotaCHr.start();
        toyotaCHr.accelerate();
    }
}

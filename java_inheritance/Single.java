package java_inheritance;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating...");
    }
}

public class Single {
    public static void main(String[] args) {
        Car toyotaCHr = new Car();
        toyotaCHr.start();
        toyotaCHr.accelerate();
    }
}

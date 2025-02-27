package java_relationships;

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println(type + " engine is starting...");
    }
}

class Car {
    private String model;
    private Engine engine; // Strongly associated with Car

    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType); // Composition: Car owns Engine
    }

    public void startCar() {
        System.out.println(model + " is starting...");
        engine.start();
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "V8");
        myCar.startCar(); // Car starts, engine starts

        // If `myCar` is deleted, engine is also deleted
    }
}

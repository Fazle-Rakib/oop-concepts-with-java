package java_interface;

interface Vehicle1 {
    void start();
    void stop();

    default void fuelEfficiency() {
        System.out.println("Fuel efficiency: Calculating based on default method.");
    }
    static void fuelWeight() {
        System.out.println("Calculating weight!!!");
    }
}

interface Chargeable {
    default void fuelEfficiency() {
        System.out.println("Fuel efficiency: Calculating based on default method.");
    }
}


class Car1 implements Vehicle1, Chargeable {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    public void fuelEfficiency() {
        System.out.println("Fuel efficiency: Calculating based on default method.");
    }

}

class Bike1 implements Vehicle1 {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping...");
    }

    @Override
    public void fuelEfficiency() {
        System.out.println("Bike fuel efficiency: 55 km per liter.");
    }
}

public class DefaultMethodsInInterface {
    public static void main(String[] args) {
        Vehicle1 car = new Car1();
        car.start();
        car.fuelEfficiency(); // Uses default method
        car.stop();

        Vehicle1 bike = new Bike1();
        bike.start();
        bike.fuelEfficiency(); // Overrides default method
        bike.stop();

        Vehicle1.fuelWeight();

        Car1 car1 = new Car1();
//        car1.fuelWeight();
    }
}

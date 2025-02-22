package java_interface;

interface Vehicle {
    void start();  // Abstract method
    void stop();
}

// Class implementing the interface
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
    public void stop() {
        System.out.println("Car is stopping...");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
    public void stop() {
        System.out.println("Bike is stopping...");
    }
}

public class InterfaceIntro {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Car is starting...
        myCar.stop();  // Car is stopping...

        Vehicle myBike = new Bike();
        myBike.start(); // Bike is starting...
        myBike.stop();  // Bike is stopping...
    }
}

/*
✔ The Car and Bike classes implement the Vehicle interface.
✔ Each class provides its own implementation of start() and stop().
✔ We can create a Vehicle reference
     Vehicle myCar = new Car();
  and assign it any class implementing the interface(polymorphism).
 */

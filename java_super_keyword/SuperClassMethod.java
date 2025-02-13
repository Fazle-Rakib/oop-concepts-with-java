package java_super_keyword;

class Vehicle {
    void fuelEfficiency() {
        System.out.println("A vehicle consumes fuel and has an efficiency rating.");
    }
}

class ElectricVehicle extends Vehicle {
    @Override
    void fuelEfficiency() {
        super.fuelEfficiency(); // Calling superclass method
        System.out.println("An electric vehicle has higher efficiency using battery power.");
    }
}

public class SuperClassMethod {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle();
        ev.fuelEfficiency(); // Calls both superclass and subclass methods
    }
}

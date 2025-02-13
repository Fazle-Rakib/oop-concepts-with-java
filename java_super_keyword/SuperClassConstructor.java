package java_super_keyword;

class Vehicle2 {
    String brand;

    // Constructor in superclass
    Vehicle2(String brand) {
        this.brand = brand;
        System.out.println("Vehicle Constructor: " + brand);
    }
}

class ElectricVehicle2 extends Vehicle2 {
    int batteryCapacity;

    // Constructor in subclass
    ElectricVehicle2(String brand, int batteryCapacity) {
        super(brand); // Calling superclass constructor
        this.batteryCapacity = batteryCapacity;
        System.out.println("Electric Vehicle Constructor: Battery Capacity is " + batteryCapacity + " kWh");
    }
}

public class SuperClassConstructor {
    public static void main(String[] args) {
        ElectricVehicle2 ev = new ElectricVehicle2("BYD", 75);
    }
}
package java_super_keyword;

class Vehicle1 {
    String brand = "Generic Vehicle";
}

class ElectricVehicle1 extends Vehicle1 {
    String brand = "Tesla"; // Same attribute name as in the parent class

    void displayBrand() {
        System.out.println("Vehicle Brand: " + super.brand); // Access parent attribute
        System.out.println("Electric Vehicle Brand: " + brand); // Access own attribute
    }
}

public class SuperClassAttribute {
    public static void main(String[] args) {
        ElectricVehicle1 ev = new ElectricVehicle1();
        ev.displayBrand();
    }
}

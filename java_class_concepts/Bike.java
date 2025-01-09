package java_class_concepts;

public class Bike {
//    fields
    int speed = 0;
    int noOfGears;
    String breakingSystem;

//    methods
    int acceleration() {
        System.out.println("Accelerating");
        return 0;
    };
//    ...

    public static void main(String[] args) {
//        Objects of bike class
        Bike hero = new Bike();
        Bike runner = new Bike();
        Bike honda = new Bike();

        System.out.println("Hero bikes initial speed:"+ hero.speed);
    }


}

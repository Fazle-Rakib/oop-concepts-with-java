package java_this_keyword;

class AmbiguousEmployee {
    private String name;
    private int age;

    // Constructor
    public AmbiguousEmployee(String name, int age) {
        name = name; // Refers to the parameter 'name'
        age = age;   // Refers to the parameter 'age'
    }

    public void displayDetails() {
        System.out.println("Displaying instance variable of AmbiguousEmployee::");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class NonAmbiguousEmployee {
    private String name;
    private int age;

    // Constructor
    public NonAmbiguousEmployee(String name, int age) {
        System.out.println("Reference of this: " + this);
        this.name = name; // Refers to the instance variable 'name'
        this.age = age;   // Refers to the instance variable 'age'
    }

    public void displayDetails() {
        System.out.println("Displaying instance variable of NonAmbiguousEmployee::");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

public class ThisIntroduction {
    public static void main(String[] args) {
        AmbiguousEmployee AE1 = new AmbiguousEmployee("Abir", 10);
//        AE1.displayDetails();

        NonAmbiguousEmployee NAE1 = new NonAmbiguousEmployee("Abir", 10);
        System.out.println("Reference of NAE1: " + NAE1);
//        NAE1.displayDetails();


    }
}

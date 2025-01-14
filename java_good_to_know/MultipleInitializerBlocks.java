package java_good_to_know;

public class MultipleInitializerBlocks {
    int age;
    static int expireDate;

    // Static initializer block: Executes only once when the class is loaded.
    static {
        System.out.println("First Static Initializer Block");
    }

    // Instance initializer block: Executes before the constructor every time an object is created.
    {
        age = 10;
        System.out.println("First Instance Initializer Block with age: " + age);
    }


    // Constructor: Executes after all instance initializer blocks for every object creation.
    public MultipleInitializerBlocks() {
        System.out.println("Constructor executed");
    }

    // Another instance initializer block: Executes in the order they appear, before the constructor.
    {
        age = 15;
        System.out.println("Second Instance Initializer Block: " + age);
    }

    public static void main(String[] args) {
        // Main Method: Program execution starts here.
        System.out.println("Main Method Starts");

        // Demonstrates the priority of blocks during object creation.
        new MultipleInitializerBlocks(); // First object creation
//        new MultipleInitializerBlocks(); // Second object creation
    }
}

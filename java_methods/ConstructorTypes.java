package java_methods;

// No-Arg Constructor Example (default visibility)
class NoArgExample {
    String message;

    public NoArgExample() {
        message = "Hello, this is a no-argument constructor!";
    }

    public void displayMessage() {
        System.out.println(message);
    }
}

class ParameterizedExample {
    String name;
    int age;
    int weight;

    public ParameterizedExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age+ " Weight: " + weight);
    }
}

class DefaultConstructorExample {
    String message;

    public void displayMessage() {
        System.out.println("This is a default constructor created by Java! message: " + message);
    }
}

public class ConstructorTypes {
    public static void main(String[] args) {
        NoArgExample noArgObj = new NoArgExample();
        noArgObj.displayMessage();

        ParameterizedExample paramObj = new ParameterizedExample("Anas", 10);
        paramObj.displayInfo();

        DefaultConstructorExample defaultObj = new DefaultConstructorExample();
        defaultObj.displayMessage();
    }
}

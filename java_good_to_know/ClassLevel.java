package java_good_to_know;

// Top-level class(public)
public class ClassLevel {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// Another top-level class in the same file (default access)
class Helper {
    void assist() {
        System.out.println("Helping...");
    }
}

// Outer is a top-level class because it is not inside another class.
// Inner is not a top-level class because it is defined inside Outer
class Outer {
    // Nested (Inner) class
    private class Inner {
        void greet() {
            System.out.println("Hello from Inner class!");
        }
    }

    void useInner() {
        Inner inner = new Inner();
        inner.greet();
    }
}



package java_inheritance;

class Parent {
    static void show() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {
    static void show() {  // Redefining the static method (method hiding)
        System.out.println("Static method in Child");
    }
}

public class StaticMethodDoestNotOverride {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();  // Calls Parent's static method

        Child c = new Child();
        c.show();  // Calls Child's static method
    }
}


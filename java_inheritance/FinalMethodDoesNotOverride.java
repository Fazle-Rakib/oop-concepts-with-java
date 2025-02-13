package java_inheritance;

class ParentClass {
    final void display() {
        System.out.println("Final method in Parent");
    }
}

class ChildClass extends ParentClass {
    // ❌ Error: Cannot override the final method
    //     void display() {
    //        System.out.println("Trying to override final method");
    //     }
}

public class FinalMethodDoesNotOverride {
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        obj.display();  // Works fine

        ChildClass obj2 = new ChildClass();
        obj2.display(); // Works, but calls Parent's method
    }
}


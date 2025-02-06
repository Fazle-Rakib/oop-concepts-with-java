package java_inheritance;

// Parent class (Super Class)
class Bird {
    String name;
    void fly() {
        System.out.println(name + " is flying!");
    }
    void eat() {
        System.out.println(name + " is eating!");
    }
}
// Child class (Sub Class)
class Cuckoo extends Bird {
    void sing() {
        System.out.println(name + " is singing melodiously!");
    }
}

// Main method
public class InheritanceIntroduction {
    public static void main(String[] args) {
        Cuckoo cuckoo = new Cuckoo();
        cuckoo.name = "Melody";
        cuckoo.fly();  // Inherited from Bird class
        cuckoo.eat();  // Inherited from Bird class
        cuckoo.sing(); // Specific to Cuckoo class
    }
}

//    Without inheritance::
//    Duplication of the same properties in multiple classes, making maintenance harder.
//    Example: Every new animal type would need to rewrite
//    name and eat(),
//    which violates DRY (Don't Repeat Yourself) principles.


package java_inheritance;

class Animal {
    void breathe() {
        System.out.println("Breathing...");
    }
}

class Mammal extends Animal {
    void feedMilk() {
        System.out.println("Feeding milk...");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is Barking...");
    }
}


public class MultiLevel {
    public static void main(String[] args) {
        Dog bullDog = new Dog();
        bullDog.breathe();
        bullDog.feedMilk();
        bullDog.bark();
    }
}

package java_inheritance;

// Complete Methods overriding first

class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle: πr²");
    }
}

class Square extends Shape {
    void area() {
        System.out.println("Area of Square: s²");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area();
        circle.draw();

        Square square = new Square();
        square.area();
        square.draw();
    }
}

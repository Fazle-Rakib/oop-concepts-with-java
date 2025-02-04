package java_this_keyword;

class Student {
    private String name;
    private int marks;

    // Constructor 1
    public Student(String name) {
        // Calls Constructor 2
//        this.name = name;
//        this.marks = 40;
        this(name, 40);
    }

    // Constructor 2
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Student abir = new Student("abir");
        System.out.println("Value of abir object::");
        abir.displayDetails();

    }
}

package java_static_keyword;

class Student {
    static String currentStudent; // Shared by all instances

    Student(String name) {
        currentStudent = name;
    }

    static void displayStudent() {
        System.out.println("Current Student: " + currentStudent);
    }
}

public class StaticIntroduction {
    public static void main(String[] args) {
        Student s1 = new Student("Amman");
        Student s2 = new Student("Nurullah");

        Student.displayStudent();
    }
}

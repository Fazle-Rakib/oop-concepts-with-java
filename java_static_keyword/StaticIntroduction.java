package java_static_keyword;

class Student {
    static String lastAdmittedStudent; // Shared by all instances
    String name;
    Student(String name) {
        this.name = name;
        lastAdmittedStudent = name;
    }
    static void displayStudent() {
//        System.out.println("Current Student: " + name);
        System.out.println("Last admitted Student: " + lastAdmittedStudent);
    }
}

public class StaticIntroduction {
    int count = 2;
    public static void main(String[] args) {
        Student s1 = new Student("Amman");
        Student.displayStudent();

        Student s2 = new Student("Nurul Hasan");
        Student.displayStudent();
    }
}

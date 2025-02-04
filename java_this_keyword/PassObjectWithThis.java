package java_this_keyword;

class Printer {
    public void print(Employee emp) {
        System.out.println("Employee Name: " + emp.getName());
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void printDetails() {
        // Passes the current object to an instance of Printer
        Printer printer = new Printer();
        printer.print(this);
    }
}

public class PassObjectWithThis {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bilal");
        employee1.printDetails();

        Employee employee2 = new Employee("Hasan");
        employee2.printDetails();
    }
}

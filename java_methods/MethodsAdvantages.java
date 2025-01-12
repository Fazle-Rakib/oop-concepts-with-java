package java_methods;

class WithoutMethods {
    public void multiplicationTable() {
        // Generate multiplication table for 5
        int num = 5;
        System.out.println("Multiplication Table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }

        // Generate multiplication table for 7
        num = 7;
        System.out.println("Multiplication Table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}

public class MethodsAdvantages {
    static void multiplicationTable(int num) {
        // Generate multiplication table of any nym
        System.out.println("Multiplication Table for " + num + ":");
        for(int i = 1; i<=10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
    public static void main(String[] args) {
        // Generate multiplication table for 5
        int num = 5;
        multiplicationTable(num);

        // Generate multiplication table for 7
        num = 7;
        multiplicationTable(num);

    }
}


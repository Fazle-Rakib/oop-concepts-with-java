package java_basics;

public class DataTypes {
    public static void main(String args[]) {
        byte age = 23;
        int balance = 10000;
        float pi = 3.14159F;
        double value_of_e = 2.71828;
        char firstAlpha = 'a';
//        System.out.println("Age: " + age);
//        System.out.println("First Alphabet: " + firstAlpha);


        pi = 4.16F;
        System.out.println("Updated value of pi: " + pi);

        // What if we want to update a constant e.g.(variable pi)
        final float PI = 3.14159F;
        // PI = 1.1F;
        System.out.println("Value of PI: " + PI);
    }
}

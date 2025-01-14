package java_methods;

public class MethodOverloadingScenario {
    static int sum2Nums(int a, int b) {
        return a+b;
    }
    static int sum3Nums(int a, int b, int c) {
        return a+b+c;
    }

    static int sum(int a, int b) {
        return a+b;
    }

//    compiler can not differentiate between these two methods as their methods signature is same
//    static void sum(int a, int b) {
//        System.out.println(a+b);
//    }

    static int sum(int a, int b, int c) {
        return a+b+c;
    }



    public static void main(String[] args) {
        int total;

        // sum 2 numbers by calling a methods
//        total = sum2Nums(2,3);
        total = sum(2,3);
        total = sum(2,3);
        System.out.println("Sum of 2 given numbers: " + total);

        // sum 3 numbers by calling a methods
//        total = sum3Nums(2,3, 10);
        total = sum(2,3, 10);
        System.out.println("Sum of 2 given numbers: " + total);
    }
}

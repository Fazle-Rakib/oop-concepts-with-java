package java_methods;

public class MethodsIntroduction {
    // create a method to sum two numbers
    int calculateSum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        // initialize two variables to sum up
        int a = 10;
        int b = 20;
        //        int sum = calculateSum(a,b); This things gives error as there is not any object instance to call the method.

        MethodsIntroduction introObject = new MethodsIntroduction();

        int result = introObject.calculateSum(a, b);
        System.out.println(result);
    }
}

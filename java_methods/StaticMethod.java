package java_methods;

public class StaticMethod {
    // define a static method that return squares of a number(as params)
    static int square(int n) {
        return n*n;
    }

    public static void main(String[] args) {
        // pass an arguments to the static method to square the number
        int squareOfNum = square(6);
        System.out.println(squareOfNum);
    }
}

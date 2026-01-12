package java_static_keyword;
class MathUtility {
    static int square(int number) {
        return number * number;
    }
}
public class Utility {
    public static void main(String[] args) {
        int result = MathUtility.square(5);
        System.out.println("Square of 5: " + result);

        result = MathUtility.square(10);
        System.out.println("Square of 10: " + result);
    }
}

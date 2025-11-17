package java_basics;

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting/Widening casting(automatically)
        // byte -> short -> char -> int -> long -> float -> double
        short firstNum = 1;
        int secondNum = firstNum + 250;
        System.out.println(secondNum);

        double x1 = 1.1;
//        int y1 = x1 + 2;
        double y1 = x1 + 2;
//        System.out.println(y1);

        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte
        double x2 = 1.1;
        int y2 = (int)x2 + 3;
//        System.out.println(y2);
    }
}

package java_basics;

public class Calculation {
    public static int sum(int x, int y) {
        return x+y;
    }
    public static void main(String args[]) {
        int firstNum = 10;
        int secondNum = 20;
        int summedValue = sum(firstNum, secondNum);
        System.out.println("Sum of 2 numbers: " + summedValue);
    }
}

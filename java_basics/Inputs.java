package java_basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        nextBoolean()	Reads a boolean value from the user
        nextByte()	    Reads a byte value from the user
        nextDouble()	Reads a double value from the user
        nextFloat()	Reads a float value from the user
        nextInt()	Reads a int value from the user
        nextLine()	Reads a String value from the user
        nextLong()	Reads a long value from the user
        nextShort()	Reads a short value from the user
         */

//      Integer inputs
//        System.out.print("Enter the nums: ");
//        int firstNum = scanner.nextInt();
//        System.out.println(firstNum);
//        firstNum = scanner.nextInt();
//        System.out.println(firstNum);

//        String java_basics.Inputs
        System.out.println("Enter name: ");
        String userName = scanner.nextLine();
        System.out.println(userName);
    }
}

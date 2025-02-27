package java_collection_framework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Declaring an array of integers
        int[] numbers = new int[5];

        // Initializing array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing elements
        System.out.println("First element: " + numbers[0]);

        // Iterating through the array
        System.out.println("Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}


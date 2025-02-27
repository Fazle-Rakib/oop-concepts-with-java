package java_collection_framework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Accessing elements
        System.out.println("First Fruit: " + fruits.get(0));

        // Iterating through the ArrayList
        System.out.println("Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing an element
        fruits.remove("Banana");

        // Checking size after removal
        System.out.println("Updated List: " + fruits);
        System.out.println("Size: " + fruits.size());

        // Converting to Array
        String[] fruitsArray = new String[fruits.size()];

        System.out.println("Converting the ArrayList to Array:");
        for (int i = 0; i < fruits.size(); i++) {
            fruitsArray[i] = fruits.get(i);
            System.out.println(fruitsArray[i]);
        }

        System.out.println("Printing Array:: " + fruitsArray);
        System.out.println("Printing ArrayList:: " + fruits);

        ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruitsArray));

        System.out.println("ArrayList: " + fruitsList);

    }
}


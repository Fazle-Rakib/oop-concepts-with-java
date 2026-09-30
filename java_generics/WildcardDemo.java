package java_generics;

import java.util.ArrayList;
import java.util.List;

// Introduces wildcards: <?>  <? extends T>  <? super T>
// Rule of thumb — PECS: Producer Extends, Consumer Super.
//   Use <? extends T> when the method reads/gets from a structure (it produces values for you).
//   Use <? super T>   when the method writes/adds into a structure (it consumes values you give).

public class WildcardDemo {

    // --- Unbounded wildcard <?> ---
    // Accepts a List of any type — we only read from it (print), never write into it.
    static void printList(List<?> list) {
        System.out.print("[ ");
        for (Object item : list) {   // <?> allows reading each element as Object
            System.out.print(item + " ");
        }
        System.out.println("]");
    }

    // --- Upper bounded wildcard <? extends Number> ---
    // Accepts List<Integer>, List<Double>, List<Float>, etc.
    // Safe to read items as Number (PRODUCER — extends).
    // Cannot add into it — the exact subtype is unknown at compile time.
    static double sumNumbers(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) {        // safe: every element IS-A Number
            total += n.doubleValue();
        }
        return total;
    }

    // --- Lower bounded wildcard <? super Integer> ---
    // Accepts List<Integer>, List<Number>, List<Object>.
    // Safe to add Integer values (CONSUMER — super).
    // Cannot safely read back as Integer — actual type could be Number or Object.
    static void fillWithZeros(List<? super Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(0);  // safe: 0 is Integer, and the list accepts Integer or any wider type
        }
    }

    public static void main(String[] args) {

        // --- printList with <?> — works for any List regardless of element type ---
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        List<Integer> scores = new ArrayList<>();
        scores.add(10);
        scores.add(20);
        scores.add(30);

        System.out.println("--- printList (unbounded <?>) ---");
        System.out.print("List<String>:  ");
        printList(names);
        System.out.print("List<Integer>: ");
        printList(scores);

        // --- sumNumbers with <? extends Number> ---
        List<Integer> intNums = new ArrayList<>();
        intNums.add(1);
        intNums.add(2);
        intNums.add(3);

        List<Double> doubleNums = new ArrayList<>();
        doubleNums.add(1.99);
        doubleNums.add(2.50);
        doubleNums.add(3.75);

        System.out.println("--- sumNumbers (<? extends Number>) ---");
        System.out.printf("List<Integer> total: %.2f%n", sumNumbers(intNums));
        System.out.printf("List<Double>  total: %.2f%n", sumNumbers(doubleNums));

        // --- fillWithZeros with <? super Integer> ---
        List<Number> numList = new ArrayList<>();

        System.out.println("--- fillWithZeros (<? super Integer>) ---");
        fillWithZeros(numList, 3);  // numList is List<Number>; Integer is a subtype of Number
        System.out.print("List<Number> after fill: ");
        printList(numList);

        // PECS summary (read this like a rule):
        // sumNumbers READS  from the list -> the list PRODUCES values  -> use extends
        // fillWithZeros WRITES into the list -> the list CONSUMES values -> use super
    }
}

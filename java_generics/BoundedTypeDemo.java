package java_generics;

// Introduces bounded type parameters: <T extends Number>
// A bound restricts which types T can be, and unlocks methods the bound guarantees T has.
// Without the bound, the compiler has no idea what T is, so it won't allow any method calls on T.

// ---- T extends Number: T must be Integer, Double, Float, Long, or any other Number subclass ----
class NumberStack<T extends Number> {
    private Object[] items;
    private int top;

    NumberStack(int capacity) {
        items = new Object[capacity];
        top = -1;
    }

    void push(T value)  { items[++top] = value; }

    T pop()             { return (T) items[top--]; }

    boolean isEmpty()   { return top == -1; }
    int size()          { return top + 1; }

    // sum() works because T extends Number, which provides doubleValue()
    double sum() {
        double total = 0;
        for (int i = 0; i <= top; i++) {
            total += ((T) items[i]).doubleValue(); // only callable because of the Number bound
        }
        return total;
    }

    // average() builds on sum() — also only possible because of the Number bound
    double average() {
        return sum() / size();
    }

    // max() compares using doubleValue() — no need for Comparable
    T max() {
        T maxVal = (T) items[0];
        for (int i = 1; i <= top; i++) {
            T current = (T) items[i];
            if (current.doubleValue() > maxVal.doubleValue()) {
                maxVal = current;
            }
        }
        return maxVal;
    }
}

public class BoundedTypeDemo {
    public static void main(String[] args) {

        // --- NumberStack<Integer>: T = Integer, which extends Number ---
        NumberStack<Integer> intStack = new NumberStack<>(10);
        intStack.push(4);
        intStack.push(7);
        intStack.push(2);
        intStack.push(9);
        intStack.push(1);

        System.out.println("--- NumberStack<Integer> ---");
        System.out.println("Sum:     " + intStack.sum());
        System.out.printf( "Average: %.1f%n", intStack.average());
        System.out.println("Max:     " + intStack.max());

        // --- NumberStack<Double>: same class, different Number subtype ---
        NumberStack<Double> doubleStack = new NumberStack<>(10);
        doubleStack.push(3.14);
        doubleStack.push(2.72);
        doubleStack.push(1.41);
        doubleStack.push(1.73);

        System.out.println("--- NumberStack<Double> ---");
        System.out.printf("Sum:     %.2f%n", doubleStack.sum());
        System.out.printf("Average: %.2f%n", doubleStack.average());
        System.out.printf("Max:     %.2f%n", doubleStack.max());

        // NumberStack<String> would be a compile error:
        // -- String does not extend Number, so the bound rejects it
    }
}

package java_generics;

// Introduces bounded type parameters.
// A bound restricts which types T can be, and unlocks methods that bound guarantees T has.

// ---- T extends Comparable<T>: guarantees compareTo() exists on T ----
// Without the bound, calling compareTo() would be a compile error.
class ComparableStack<T extends Comparable<T>> {
    private Object[] items;
    private int top;

    ComparableStack(int capacity) {
        items = new Object[capacity];
        top = -1;
    }

    void push(T value)   { items[++top] = value; }

    @SuppressWarnings("unchecked")
    T pop()              { return (T) items[top--]; }

    boolean isEmpty()    { return top == -1; }
    int size()           { return top + 1; }

    // peekMax() scans without removing — possible only because T has compareTo()
    @SuppressWarnings("unchecked")
    T peekMax() {
        T max = (T) items[0];
        for (int i = 1; i <= top; i++) {
            if (((T) items[i]).compareTo(max) > 0) {
                max = (T) items[i];
            }
        }
        return max;
    }
}

// ---- T extends Number: guarantees doubleValue() exists on T ----
class NumberStack<T extends Number> {
    private Object[] items;
    private int top;

    NumberStack(int capacity) {
        items = new Object[capacity];
        top = -1;
    }

    void push(T value)   { items[++top] = value; }

    @SuppressWarnings("unchecked")
    T pop()              { return (T) items[top--]; }

    boolean isEmpty()    { return top == -1; }

    // sum() is possible because T extends Number, which provides doubleValue()
    @SuppressWarnings("unchecked")
    double sum() {
        double total = 0;
        for (int i = 0; i <= top; i++) {
            total += ((T) items[i]).doubleValue();
        }
        return total;
    }
}

public class BoundedTypeDemo {
    public static void main(String[] args) {

        // --- ComparableStack<Integer>: Integer implements Comparable<Integer> ---
        ComparableStack<Integer> intCStack = new ComparableStack<>(10);
        intCStack.push(4);
        intCStack.push(7);
        intCStack.push(2);
        intCStack.push(9);
        intCStack.push(1);

        System.out.println("--- ComparableStack<Integer> ---");
        System.out.println("Max: " + intCStack.peekMax());
        System.out.println("Stack size unchanged: " + intCStack.size());

        // --- ComparableStack<String>: String also implements Comparable<String> ---
        ComparableStack<String> strCStack = new ComparableStack<>(10);
        strCStack.push("Mango");
        strCStack.push("Apple");
        strCStack.push("Banana");

        System.out.println("--- ComparableStack<String> ---");
        System.out.println("Max (lexicographic): " + strCStack.peekMax());

        // ComparableStack<StringBuilder> would be a compile error:
        // -- StringBuilder does not implement Comparable

        // --- NumberStack<Double>: Double extends Number ---
        NumberStack<Double> numStack = new NumberStack<>(10);
        numStack.push(3.14);
        numStack.push(2.72);
        numStack.push(1.00);
        numStack.push(4.00);

        System.out.println("--- NumberStack<Double> ---");
        System.out.printf("Sum: %.2f%n", numStack.sum());
    }
}

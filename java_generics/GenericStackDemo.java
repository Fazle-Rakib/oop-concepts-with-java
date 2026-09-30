package java_generics;

// Introduces a generic class Stack<T> that replaces both IntStack and StringStack
// from NonGenericDemo with a single, type-safe implementation.

// ---- Generic Stack: <T> is a type parameter, resolved at usage time ----
class Stack<T> {
    private Object[] items; // Object[] used because Java does not allow new T[capacity]
    private int top;
    private int capacity;

    Stack(int capacity) {
        this.capacity = capacity;
        items = new Object[capacity];
        top = -1;
    }

    void push(T value) {
        items[++top] = value;
    }

    // @SuppressWarnings: safe — only T values are ever placed into this array
    @SuppressWarnings("unchecked")
    T pop() {
        return (T) items[top--];
    }

    @SuppressWarnings("unchecked")
    T peek() {
        return (T) items[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }
}

public class GenericStackDemo {
    public static void main(String[] args) {

        // --- Stack<Integer>: T is replaced by Integer throughout ---
        Stack<Integer> intStack = new Stack<>(5); // diamond operator infers <Integer>
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        System.out.println("--- Stack<Integer> ---");
        while (!intStack.isEmpty()) {
            System.out.println("Popped: " + intStack.pop());
        }

        // --- Stack<String>: same class, different type argument ---
        Stack<String> strStack = new Stack<>(5);
        strStack.push("Alice");
        strStack.push("Bob");
        strStack.push("Charlie");

        System.out.println("--- Stack<String> ---");
        while (!strStack.isEmpty()) {
            System.out.println("Popped: " + strStack.pop());
        }

        // Type mismatch is now caught at compile time, not runtime:
        // strStack.push(42); -- compile error: int cannot be converted to String
    }
}

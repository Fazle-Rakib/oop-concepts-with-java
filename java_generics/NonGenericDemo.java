package java_generics;

// Demonstrates the problem generics solve:
// duplicated stack classes that differ only in their element type.

// ---- Stack that holds only integers ----
class IntStack {
    private int[] items;
    private int top;

    IntStack(int capacity) {
        items = new int[capacity];
        top = -1;
    }

    void push(int value) {
        items[++top] = value;
    }

    int pop() {
        return items[top--];
    }

    int peek() {
        return items[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

// ---- Stack that holds only Strings ----
// Nearly identical to IntStack — only the type changed.
class StringStack {
    private String[] items;
    private int top;

    StringStack(int capacity) {
        items = new String[capacity];
        top = -1;
    }

    void push(String value) {
        items[++top] = value;
    }

    String pop() {
        return items[top--];
    }

    String peek() {
        return items[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class NonGenericDemo {
    public static void main(String[] args) {

        // --- IntStack usage ---
        IntStack intStack = new IntStack(5);
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        System.out.println("--- IntStack ---");
        while (!intStack.isEmpty()) {
            System.out.println("Popped: " + intStack.pop());
        }

        // --- StringStack usage ---
        StringStack strStack = new StringStack(5);
        strStack.push("Alice");
        strStack.push("Bob");
        strStack.push("Charlie");

        System.out.println("--- StringStack ---");
        while (!strStack.isEmpty()) {
            System.out.println("Popped: " + strStack.pop());
        }

        // IntStack and StringStack contain identical logic — only the type differs.
        // Need a DoubleStack next? Copy-paste again. A StudentStack? Copy-paste again.
        // Generics solve this: one class, any type, zero duplication.
    }
}

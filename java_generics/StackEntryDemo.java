package java_generics;

// Introduces two independent type parameters <K, V> through a StackEntry wrapper.
// A StackEntry pairs a key with a value before pushing both onto a Stack together.

// ---- Two type parameters: K for the key, V for the value ----
class StackEntry<K, V> {
    private K key;
    private V value;

    StackEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    K getKey()   { return key; }
    V getValue() { return value; }

    // toString shows both key and value using their own toString()
    public String toString() {
        return key + " -> " + value;
    }
}

// Stack<T> redeclared here — each file is self-contained and runnable independently
class Stack2<T> {
    private Object[] items;
    private int top;

    Stack2(int capacity) {
        items = new Object[capacity];
        top = -1;
    }

    void push(T value)    { items[++top] = value; }

    @SuppressWarnings("unchecked")
    T pop()               { return (T) items[top--]; }

    boolean isEmpty()     { return top == -1; }
}

public class StackEntryDemo {
    public static void main(String[] args) {

        // --- Stack of student roll numbers mapped to names ---
        // K = Integer (roll number), V = String (student name)
        Stack2<StackEntry<Integer, String>> studentStack = new Stack2<>(5);
        studentStack.push(new StackEntry<>(101, "Alice"));
        studentStack.push(new StackEntry<>(102, "Bob"));
        studentStack.push(new StackEntry<>(103, "Carol"));

        System.out.println("--- Student Roll -> Name Stack ---");
        while (!studentStack.isEmpty()) {
            System.out.println(studentStack.pop());
        }

        // --- Stack of subject codes mapped to GPA scores ---
        // K = String (subject code), V = Double (GPA)
        Stack2<StackEntry<String, Double>> gradeStack = new Stack2<>(5);
        gradeStack.push(new StackEntry<>("CS101", 4.00));
        gradeStack.push(new StackEntry<>("CS201", 3.50));
        gradeStack.push(new StackEntry<>("CS301", 3.75));

        System.out.println("--- Subject Code -> GPA Stack ---");
        while (!gradeStack.isEmpty()) {
            System.out.println(gradeStack.pop());
        }

        // K and V are resolved independently at each usage — they can be any types.
    }
}

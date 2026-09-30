package java_generics;

// Introduces generic methods: <T> declared on the method itself, not the class.
// StackUtil is a plain, non-generic class whose methods each carry their own <T>.

// Stack redeclared for standalone compilation
class Stack3<T> {
    private Object[] items;
    private int top;

    Stack3(int capacity) {
        items = new Object[capacity];
        top = -1;
    }

    void push(T value)    { items[++top] = value; }

    T pop()               { return (T) items[top--]; }

    T peek()              { return (T) items[top]; }

    boolean isEmpty()     { return top == -1; }
    int size()            { return top + 1; }
}

// ---- Non-generic class with generic methods ----
class StackUtil {

    // <T> before the return type makes this method its own generic scope
    static <T> void transfer(Stack3<T> source, Stack3<T> dest) {
        while (!source.isEmpty()) {
            dest.push(source.pop());
        }
    }

    // The compiler infers T from the arguments — no explicit <T> needed at the call site
    static <T> boolean contains(Stack3<T> stack, T target) {
        Stack3<T> temp = new Stack3<>(20);
        boolean found = false;

        // drain into temp while searching
        while (!stack.isEmpty()) {
            T item = stack.pop();
            if (item.equals(target)) found = true;
            temp.push(item);
        }

        // restore original order
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return found;
    }

    static <T> void printAll(Stack3<T> stack) {
        Stack3<T> temp = new Stack3<>(20);
        while (!stack.isEmpty()) {
            T item = stack.pop();
            System.out.print(item + " ");
            temp.push(item);
        }
        System.out.println();
        while (!temp.isEmpty()) stack.push(temp.pop()); // restore
    }
}

public class GenericMethodDemo {
    public static void main(String[] args) {

        // --- transfer(): move all items from source to destination ---
        Stack3<Integer> source = new Stack3<>(5);
        Stack3<Integer> dest   = new Stack3<>(5);
        source.push(10);
        source.push(20);
        source.push(30);

        StackUtil.transfer(source, dest); // T inferred as Integer

        System.out.println("--- transfer() ---");
        System.out.print("Source (should be empty): ");
        System.out.println(source.isEmpty() ? "empty" : "not empty");
        System.out.print("Destination: ");
        StackUtil.printAll(dest);

        // --- contains(): check if a value exists in the stack ---
        Stack3<String> names = new Stack3<>(5);
        names.push("Alice");
        names.push("Bob");
        names.push("Carol");

        System.out.println("--- contains() ---");
        System.out.println("Contains 'Bob': "  + StackUtil.contains(names, "Bob"));
        System.out.println("Contains 'Eve': "  + StackUtil.contains(names, "Eve"));

        // --- printAll(): print every element without permanently draining the stack ---
        Stack3<Double> nums = new Stack3<>(5);
        nums.push(1.41);
        nums.push(2.72);
        nums.push(3.14);

        System.out.println("--- printAll() ---");
        StackUtil.printAll(nums);
        System.out.println("Stack still has " + nums.size() + " items after printAll");
    }
}

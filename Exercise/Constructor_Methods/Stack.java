package Exercise.Constructor_Methods;
public class Stack {
    int stack[] = new int[10];
    int tos;  // top-of-stack
    void push(){
        System.out.println("I will stack an item!");
    }
    void pop() {
        System.out.println("I will pop an item!");
    }
}
class StackDemo {
    public static void main(String[] args) {
        Stack stackObj1 = new Stack();
        stackObj1.push();
        stackObj1.pop();
    }
}
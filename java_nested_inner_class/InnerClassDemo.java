package java_nested_inner_class;
class OuterClass {
    int x = 105;

    void test() {
        InnerClass in1 = new InnerClass();
        System.out.println("Y for in1: " + in1.y);
        in1.display();
    }

    // this is an inner class
    class InnerClass {
        int y = 5;
        void display() {
            System.out.println("Accessing the value of x: " + x);
        }
    }

    void displayY() {
//        System.out.println("Y is: " + y);
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass out1 = new OuterClass();
        out1.test();
    }
}

package java_basics;
class Box {
    double width;
    double height;
    double depth;

    // Constructor
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    void boxInitializer(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    protected void volume() {
        double total_volume = this.width * this.height * this.depth;
        System.out.println("Volume of box: " + total_volume);
    }
}
public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box(10, 5, 10);
        Box box2 = new Box(5, 10, 15);

//        box1.boxInitializer(10,20, 10);
//        box2.boxInitializer(5,10, 15);
//        box1.width = 10;
//        box1.height = 20;
//        box1.depth = 10;

//        box2.width = 5;
//        box2.height = 10;
//        box2.depth = 15;

        box1.volume();
        box2.volume();
        System.out.println("Width of box1: " + box1.width);

//        double volume = box1.width * box1.height * box1.depth;
//        System.out.println("Volume of box1: " + volume);

//        volume = box2.width * box2.height * box2.depth;
//        System.out.println("Volume of box2: " + volume);
    }
}

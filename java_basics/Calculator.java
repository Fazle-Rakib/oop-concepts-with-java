package java_basics;
class SimpleCalculator{
    int x,y;
    int result;
    public SimpleCalculator(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void addition(){
        result = x+y;
    }
    public void subtraction(){
        result = x-y;
    }
}

public class Calculator {
    public static void main(String[] args) {
        SimpleCalculator cal1 = new SimpleCalculator(5, 3);
        SimpleCalculator cal2 = new SimpleCalculator(8, 10);

        System.out.println(cal1.x + " " + cal1.y);

        cal2.x = 10;
        cal1.addition();
        cal2.addition();

        System.out.println(cal1.result);
        System.out.println(cal2.result);

    }
}

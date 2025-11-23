import java.util.Scanner;
public class practice_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        //double radius = (double) rad;
        double area = 3.1416 * rad * rad;
        System.out.println(area);
    }
}

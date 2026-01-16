import java.util.Scanner;
public class practice_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        double volume = (4/3)* 3.1416 * rad * rad * rad;
        System.out.println(volume);
    }
}

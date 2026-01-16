import java.util.Scanner;
public class practice_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arm = sc.nextInt();
        double value=Math.sqrt(3);
        double area = (value* arm * arm)/4;
        System.out.println(area);
    }
}

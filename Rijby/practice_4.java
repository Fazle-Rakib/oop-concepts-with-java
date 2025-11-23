import java.util.Scanner;
public class practice_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int celcius = sc.nextInt();
        double f = ((9*celcius) + 160)/5;
        System.out.println(f);
    }
}

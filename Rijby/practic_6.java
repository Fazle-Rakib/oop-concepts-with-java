import java.util.Scanner;
public class practic_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        double s = (a+b+c)/2;
        double area = s*(s-a)*(s-b)*(s-c);
        area = Math.sqrt(area);
        System.out.println(area);
    }
}

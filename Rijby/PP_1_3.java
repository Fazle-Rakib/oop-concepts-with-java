import java.util.Scanner;
public class PP_1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=90){
            System.out.println("A+");
        }
        else if(num>=80){
            System.out.println("A");
        }
        else if(num>=70){
            System.out.println("A-");
        }
        else if(num>=60){
            System.out.println("B");
        }
        else if(num>=40){
            System.out.println("C+");
        }
        else{
            System.out.println("F");
        }
    }
}

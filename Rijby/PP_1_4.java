import java.util.Scanner;
public class PP_1_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b=sc.nextInt();
        char ch = sc.next().charAt(0);
        if(ch=='+'){
            System.out.println(a+b);
        }
        else if(ch=='-'){
            System.out.println(a-b);
        }
        else if(ch=='*'){
            System.out.println(a*b);
        }
        else{
            System.out.println((double)a/(double)b);
        }
    }
}

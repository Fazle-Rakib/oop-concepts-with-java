package java_basics;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while ( i < 5 ){
            i++;
            if( i == 2) continue;
            System.out.println(i);
        }

        while(true) {
            System.out.println(i + "Infinite");
            if(i > 3) {
                break;
            }
            i++;
        }
    }
}

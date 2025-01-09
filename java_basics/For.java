package java_basics;

public class For {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print( String.valueOf(i) + String.valueOf(j) + " | "); // Inner loop runs n times for each external loop iteration
            }
            System.out.println();
        }
    }
}

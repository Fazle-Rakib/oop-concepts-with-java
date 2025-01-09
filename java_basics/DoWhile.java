package java_basics;

public class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

//        Will run at-least once
        i = 5;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}


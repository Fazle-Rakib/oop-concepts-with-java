package java_basics;

public class Array {
    public static void main(String[] args) {
        int a = 1; // Memory: 101
        int b = 2; // Memory: 105
//        [100, 60, 89, 50, 65]

        int[] subject1WiseResult = {100, 60, 89, 50, 65};
        int subject2WiseResult[] = {100, 60, 89, 50, 65};

//        System.out.println(subject1WiseResult[0]);
//        subject1WiseResult[3] = 60;
//        System.out.println(subject1WiseResult[3]);

//        for(int mark : subject1WiseResult) {
//            System.out.println(mark);
//        }

        String[][] seats = {
                {"A1", "B1" , "C1", "D1"},
                {"A2", "B2" , "C2", "D2"}
        };

        for (String[] seat : seats) {
            for (String num : seat) {
                System.out.println(num);
            }
        }
    }
}

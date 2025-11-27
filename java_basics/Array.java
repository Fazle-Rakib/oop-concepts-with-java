package java_basics;

public class Array {
    public static void main(String[] args) {
        int a = 100; // Memory: 101
        int b = 60; // Memory:  133
//        [100, 60, 89, 50, 65]

        int[] subjectWiseResult1 = {100, 60, 89, 50, 65};
        int subjectWiseResult2[] = {100, 60, 89, 50, 65};

        int subjectWiseResult3[];
        subjectWiseResult3 = new int[5];

//        System.out.println(subject1WiseResult[0]);
//        subject1WiseResult[3] = 60;
//        System.out.println(subject1WiseResult[3]);

//        for(int i = 0; i < 5; i++){
//            System.out.println(subjectWiseResult3[i]);
//        }

//        for(int mark : subjectWiseResult3) {
//            System.out.println(mark);
//        }

        String[][] seats = {
                {"A1", "B1" , "C1", "D1"},
                {"A2", "B2" , "C2", "D2"}
        };

        for (String[] row : seats) {
            for (String seat : row) {
                System.out.println(seat);
            }
        }
    }
}

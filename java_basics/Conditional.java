package java_basics;

public class Conditional {
    public static void main(String[] args) {
        float result = 79.4F;
        String letterGrade;
        if(result >= 80) {
            letterGrade = "A+";
        } else if(result >= 70) {
            letterGrade = "A";
        } else if(result >= 60) {
            letterGrade = "A-";
        } else {
            letterGrade = "F";
        }

        System.out.println("Grade: " + letterGrade);

        String resultStatus = result < 40 ? "Failed" : "Passed";
        System.out.println(resultStatus);
    }
}

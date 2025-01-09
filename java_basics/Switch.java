package java_basics;

public class Switch {
    public static void main(String[] args) {
        int weekDay = 10;
        switch (weekDay) {
            case 1, 2, 3:
                System.out.println("Sunday");
                break;
//            case 2:
//                System.out.println("Mon");
//                break;
//            case 3:
//                System.out.println("Tue");
//                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Thu");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

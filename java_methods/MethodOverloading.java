package java_methods;

public class MethodOverloading {

    public static double calculateLateFee(int daysLate) {
        double penaltyRate = 15;
        return daysLate * penaltyRate;
    }

    public static double calculateLateFee(int daysLate, int numberOfBooks) {
        double penaltyRate = 15;
        return daysLate * numberOfBooks * penaltyRate;
    }

    public static double calculateLateFee(int daysLate, double customRate) {
        return daysLate * customRate;
    }

    public static void main(String[] args) {
        // Use case 1: Late fee for a single book
        System.out.println("Fee for 5 days late (1 book): BDT" + calculateLateFee(5));

        // Use case 2: Late fee for multiple books
        System.out.println("Fee for 5 days late (3 books): BDT" + calculateLateFee(5, 3));

        // Use case 3: Late fee for a single book with a custom rate
        System.out.println("Fee for 5 days late (1 book, BDT 2 per day): BDT" + calculateLateFee(5, 2.0));
    }
}


package java_basics;
/**
 * Javadoc Comment: Describes class/method for API docs
 * This class shows all 3 types of comments in Java.
 */
public class Comments {

    // Single-line comment: Quick note
    public static void main(String[] args) {

        /* Multi-line comment:
         * Used for longer explanations.
         * Can span multiple lines.
         */

        System.out.println("Comments in Java!");
    }

    /**
     * Utility method to check if the given amount is a valid Bangladeshi banknote.
     * Valid BDT banknotes (as of 2025): 2, 5, 10, 20, 50, 100, 500, 1000
     * @param amount the monetary amount to validate (in BDT)
     * @return true if amount matches a standard banknote value, false otherwise
     */
    public static boolean isValidBanknote(float amount) {
        // List of valid BDT banknote denominations
        return amount == 2 || amount == 5 || amount == 10 ||
                amount == 20 || amount == 50 || amount == 100 ||
                amount == 500 || amount == 1000;
    }


}

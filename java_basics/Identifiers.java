package java_basics;

public class Identifiers {
    public static void printStatement(String sample) {
        System.out.println(sample);
    }

    public static void main(String[] args) {
        int classNo = 3;
        String x = "2022-23";
        String session = "2022-23";

        /*
            The general rules for naming variables are:
            1. Names can contain letters, digits, underscores(_), and dollar($) signs
            2. Names can begin with letters, $ and _
            3. Names are case-sensitive ("myVar" and "myvar" are different variables)
            4. Reserved words (like Java keywords, such as int or boolean) cannot be used as names
         */

//        int 1a = 32; // Invalid name: starts with digit
//        int a 1 = 32; // Invalid name: white-space
        int a_1 = 32; // snake case
        int _a1 = 32;
        int $a_1 = 32;

        /*
            Better naming approach:
            1. Names should start with a lowercase letter, and cannot contain whitespace.
            2. Descriptive names (e.g., instead of x, y -> age, sum, totalVolume).
            3. Follow camelCase for variable and method names (e.g., totalVolume, calculateSum).
            4. Use PascalCase for class names (e.g., CustomerDetails, OrderProcessor).
            5. Constants should be in uppercase with underscores (e.g., MAX_VALUE, DEFAULT_TIMEOUT).
            6. Maintain consistency in naming conventions across the codebase.
        */

        int m = 60; // m=> slope, minutes, meter-scale
        int minutesInHour = 60;
        int minutes_in_hour = 60;

        // constants
        final int MAX_TEMPERATURE = 100;
    }
}

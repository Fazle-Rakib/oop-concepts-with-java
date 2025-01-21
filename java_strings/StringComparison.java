package java_strings;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        // Using ==
        System.out.println("Using == :");
        System.out.println(str1 == str2); // true (both reference the same object in the pool)
        System.out.println(str1 == str3); // false (different memory locations)

        // Using equals()
        System.out.println("Using equals():");
        System.out.println(str1.equals(str2)); // true (compares content)
        System.out.println(str1.equals(str3)); // true (compares content)
    }
}


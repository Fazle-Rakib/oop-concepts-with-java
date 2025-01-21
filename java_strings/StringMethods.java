package java_strings;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);

        // toLowerCase() and toUpperCase()
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());

        // charAt()
        System.out.println("Character at index 7: " + str.charAt(7));

        // substring()
        System.out.println("Substring (7 to 12): " + str.substring(7, 12));

        // indexOf()
        System.out.println("Index of 'World': " + str.indexOf("World"));

        // replace()
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        System.out.println(str);

        // trim()
        String spaced = "   Hello, Java!   ";
        System.out.println("Trimmed String: " + spaced.trim());
    }
}


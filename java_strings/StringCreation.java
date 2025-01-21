package java_strings;

public class StringCreation {
    public static void main(String[] args) {
        // Creating string directly
        String str1 = "Hello, Java with string literal!";
        // Creating string using the new keyword
        String str2 = new String("Hello, Java with class()!");

        System.out.println("String created directly: " + str1);
        System.out.println("String created using 'new': " + str2);
    }
}

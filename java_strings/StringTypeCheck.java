package java_strings;

public class StringTypeCheck {
    public static void main(String[] args) {
        String str = "Java is fun!";
        String str1 = "Java is fun!";
        String strWithNew = new String("Java is fun!");
        System.out.println("String value: " + str);
        System.out.println("Is String a primitive type? No, it is an object.");
        System.out.println("Hash Code derived from memory address of str: " + System.identityHashCode(str));
        System.out.println("Hash Code derived from memory address of str1: " + System.identityHashCode(str1));
        System.out.println("Hash Code derived from memory address of strWithNew: " + System.identityHashCode(strWithNew));
    }
}


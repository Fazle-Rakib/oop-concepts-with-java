package java_strings;

public class StringTypeCheck {
    public static void main(String[] args) {
        String str = "Java is fun!";
        String str1 = "Java is fun!";
        String strWithNew = new String("Java is fun!");
        String strWithNew1 = new String("Java is fun!");
        System.out.println("String value: " + str);
        System.out.println("Is String a primitive type? No, it is an object.");
        System.out.println("Memory Address (hash code) str: " + str.hashCode());
        System.out.println("Memory Address (hash code) str1: " + str1.hashCode());
        System.out.println("Memory Address (hash code) strWithNew: " + strWithNew.hashCode());
        System.out.println("Memory Address (hash code) strWithNew1: " + strWithNew1.hashCode());
    }
}


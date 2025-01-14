package java_methods;

public class ConstructorOverloading {
    String lang = "C";

    ConstructorOverloading() {
        lang = "Java";
    }

    ConstructorOverloading(String programmingLang) {
        lang = programmingLang;
    }

    void langChange() {
        lang = "Python";
    }

    public static void main(String[] args) {
        ConstructorOverloading constructorObj = new ConstructorOverloading();
        System.out.println("We are learning " + constructorObj.lang);

        ConstructorOverloading constructorObj1 = new ConstructorOverloading("Python");
        System.out.println("We are learning " + constructorObj1.lang);

    }
}

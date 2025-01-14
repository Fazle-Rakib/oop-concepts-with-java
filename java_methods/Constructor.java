package java_methods;

public class Constructor {
    String lang = "C";

    Constructor() {
        lang = "Java";
    }

    void langChange() {
        lang = "Python";
    }

    public static void main(String[] args) {
        Constructor constructorObj = new Constructor();
        System.out.println("We are learning " + constructorObj.lang);

//        constructorObj.langChange();
//        System.out.println("We are learning " + constructorObj.lang);

    }
}

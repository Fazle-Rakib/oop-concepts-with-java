package java_class_concepts;

import java_class_concepts.multiclass.CustomPackageClass;

public class UseCustomPackage {
    public static void main(String[] args) {
        CustomPackageClass customObject = new CustomPackageClass();
        System.out.println(customObject.x);
    }
}

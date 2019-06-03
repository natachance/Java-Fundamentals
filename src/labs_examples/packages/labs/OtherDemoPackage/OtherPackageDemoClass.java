package labs_examples.packages.labs.OtherDemoPackage;

import labs_examples.packages.labs.DemoPackage.PackageDemoClass;

public class OtherPackageDemoClass {
    public static void main(String[] args) {
        System.out.println("Calling the otherPackageDemoMethod from within the OtherPackageDemoClass:");
        otherPackageDemoMethod();

        //methods from PackageDemoClass unavailable here due to protected and default access modifiers
    }

    public static void otherPackageDemoMethod(){
        System.out.println("This method is in the OtherPackageDemoClass and is public.");
        System.out.println();
    }
}

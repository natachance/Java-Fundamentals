package labs_examples.packages.labs.DemoPackage;

import labs_examples.packages.labs.OtherDemoPackage.OtherPackageDemoClass;

public class PackageDemoClass {
    public static void main(String[] args) {
        System.out.println("Calling the protected packageDemoMethod from within the PackageDemoClass:");
        packageDemoMethod();

        System.out.println("Calling the otherPackageDemoMethod from within the PackageDemoClass:");
        OtherPackageDemoClass.otherPackageDemoMethod();

        System.out.println("Calling the protected oneMorePackageDemoMethod from within the PackageDemoClass:");
        oneMorePackageDemoMethod();

    }

    //can't call this method from OtherPackageDemoClass because of protected access modifier
    protected static void packageDemoMethod() {
        System.out.println("This method is in the PackageDemoClass and is protected.");
        System.out.println();
    }

    //can't call this method from OtherPackageDemoClass because of default access modifier
    static void oneMorePackageDemoMethod(){
        System.out.println("This method is in the PackageDemoClass and has the default access modifier.");
        System.out.println();
    }
}
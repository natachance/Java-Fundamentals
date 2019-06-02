package labs_examples.static_nonstatic.labs;

public class StaticDemoController {
    public static void main(String[] args) {
    // 1) A static method calling another static method in the same class
        staticDemoMethod();

    // 2) A static method calling a non-static method in the same class
        StaticDemoController demo = new StaticDemoController();
        demo.nonStaticDemoMethod();

    // 3) A static method calling a static method in another class
        System.out.println("Static method calling a static method in another class");
        System.out.println(Math.PI);
        System.out.println();

    // 4) A static method calling a non-static method in another class
        OtherStaticDemo demo2 = new OtherStaticDemo();
        demo2.otherNonStaticMethod();

    // 3b) A static method calling a static method in another class
        System.out.println("Static method calling a static method in another class");
        demo2.otherNonStaticMethod();

    //5) A non-static method calling a non-static method in the same class
    //6) A non-static method calling a non-static method in another class
    //7) A non-static method calling a static method in the same class
    //8) A non-static method calling a static method in another class
        demo.methodWithin(demo2);
    }

    public static void staticDemoMethod(){
        System.out.println("Calling a static method.");
        System.out.println();
    }

    public void nonStaticDemoMethod(){
        System.out.println("Calling a non-static method.");
        System.out.println();
    }

    public void methodWithin(OtherStaticDemo otherStaticDemo) {
        System.out.println("Non-static method called from within non-static method:");
        nonStaticDemoMethod();

        System.out.println("Non-static method calling non-static method from another class:");
        otherStaticDemo.otherNonStaticMethod();

        System.out.println("Non-static method calling a static method in same class:");
        staticDemoMethod();

        System.out.println("Non-static method calling a static method in another class:");
        System.out.println(Math.E);
        OtherStaticDemo.otherStaticMethod();
    }
}


abstract class methods {
    abstract void method1();

    abstract void method2();

    abstract void method3();
}

class Example extends methods {
    void method1() {
        System.out.println("this is method 1 from example class");
    }

    void method2() {
        System.out.println("this is method 2 from example class");
    }

    void method3() {
        System.out.println("this is method 3 from example class");
    }
}

interface Parent1 {
    void MethodParent1();
}

interface Parent2 {
    void MethodParent2();
}

class parent3 {
    void MethodParent3() {
        System.out.println("this methods is from parent 3");
    }
}

public class Example extends parent3 implements Parent1, Parent2 {
    @Override
    public void MethodParent1() {
        System.out.println("this methods is from parent 1");
    }

    @Override
    public void MethodParent2() {
        System.out.println("this methods is from parent 2");
    }
}
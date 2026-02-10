class parent1 {
    void doSomthingParent1() {
        System.out.println("doing someting parent 1");
    }
}

interface parent2 {
    void doSomthingParent2();
}

class child extends parent1 implements parent2 {
    @Override
    public void doSomthingParent2() {
        System.out.println("this method is overrided by child class from parent 2");
    }
}

public class App {
    public static void main(String[] args) {
        child c1 = new child();
        c1.doSomthingParent1();
        c1.doSomthingParent2();
    }
}
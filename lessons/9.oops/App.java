class Animal {
    String name = "some name";
    int legs = 3;
    boolean canWalk = true;
    boolean canFly = true;

    void displayData() {
        System.out.println("animal name is " + name);
        System.out.println("this animal have " + legs + " legs");
        System.out.println("can this animal walk ? " + canWalk);
        System.out.println("can this animal fly ? " + canFly);
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("hello");
        Animal animal1 = new Animal();
        System.out.println(animal1.name);
    }
}

import java.util.*;

class birds {
    // properties
    int wings = 2;
    int legs = 2;
    String name = "just birds";
    boolean canFly = true;

    // constructors
    // we can use a constructor as primary getter method
    birds(int wings, int legs, String name, boolean canFly) {
        // this keyword
        this.wings = wings;
        this.legs = legs;
        this.name = name;
        this.canFly = canFly;
    }

    // getter/setter

    // setter
    // void createBirdInfo(int wings, int legs, String name, boolean canFly) {
    // // this keyword
    // this.wings = wings;
    // this.legs = legs;
    // this.name = name;
    // this.canFly = canFly;
    // }

    // methods
    // getter
    void info() {
        System.out.println("hello i'm " + name + " bird !");
        System.out.println("i have " + wings + " wings.");
        System.out.println("i have " + legs + " legs.");
        if (canFly) {
            System.out.println("i can fly !");
        } else {
            System.out.println("i can't fly !");
        }
    }

    void eat() {
        System.out.println(name + " bird is eating !");
    }

    void sleep() {
        System.out.println(name + " bird is sleeping !");
    }

    void fly() {
        System.out.println(name + " bird is flying !");
    }
}

public class App {
    public static void main(String[] args) {
        birds bird1 = new birds(2, 2, "sparrow", true);

        birds bird2 = new birds(4, 2, "hen", false);

        birds bird3 = new birds(2, 2, "Eagle", true);

        // bird1.createBirdInfo(2, 2, "sparrow", true);
        // bird2.createBirdInfo(4, 2, "hen", false);
        // bird3.createBirdInfo(2, 2, "Eagle", true);

        bird1.info();
        bird1.eat();
        bird1.sleep();

        bird2.info();

        bird3.info();

    }
}
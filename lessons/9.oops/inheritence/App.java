package inheritence;

class animal {
    String name;
    String type;
    int limbs;
    Boolean canFly;
    Boolean canSwim;
    Boolean canRun;
    Boolean canWalk;
    Boolean canJump;

    animal(String name, String type, int limbs, Boolean canFly, Boolean canSwim, Boolean canWalk, Boolean canRun,
            Boolean canJump) {
        this.name = name;
        this.type = type;
        this.limbs = limbs;
        this.canFly = canFly;
        this.canSwim = canSwim;
        this.canRun = canRun;
        this.canWalk = canWalk;
        this.canJump = canJump;
    }

    void DisplayInfo() {
        System.out.println("Hi, i am " + this.name + " animal !");
        System.out.println("I have " + this.limbs + " limbs !");
        System.out.println("I'm " + type + " type !");
        if (canFly) {
            System.out.println("i can fly !");
        } else {
            System.out.println("i can't fly !");
        }
        if (canJump) {
            System.out.println("i can jump !");
        } else {
            System.out.println("i can't jump !");
        }
        if (canSwim) {
            System.out.println("i can swim !");
        } else {
            System.out.println("i can't swim !");
        }
        if (canWalk) {
            System.out.println("i can walk !");
        } else {
            System.out.println("i can't walk !");
        }
        if (canRun) {
            System.out.println("i can run !");
        } else {
            System.out.println("i can't run !");
        }
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void sleep() {
        System.out.println(this.name + " is sleeping");
    }
}

class bird extends animal {
    int wings;

    bird(String name, String type, int limbs, Boolean canFly, Boolean canSwim, Boolean canWalk, Boolean canRun,
            Boolean canJump, int wings) {
        super(name, type, limbs, canFly, canSwim, canWalk, canRun, canJump);
        this.wings = wings;
    }

    void fly() {
        System.out.println(this.name + " is flying !");
    }
}

public class App {
    public static void main(String[] args) {

        animal a1 = new animal("dog", "land animal", 4, false, true, true, true, true);

        a1.DisplayInfo();

        bird b1 = new bird("sparrow", "sky animal", 2, true, false, false, false, true, 2);

        // b1.SetAnimalInfo("sparrow", "sky animal", 2, true, false, false, false,
        // true);

        b1.eat();
        b1.sleep();
        b1.DisplayInfo();
        b1.fly();
    }
}

// inheritence

// 1.single level
// animal (parent class)
// |
// |
// bird (child class)

// 2.multi level
// parent 1 (parent class)
// |
// |
// child 1 parent 2 (child class)
// |
// |
// child 2 (parent class)
// |
// |
// bird (child class)
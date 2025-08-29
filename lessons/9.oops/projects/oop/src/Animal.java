class Animal {
    String name = "some name";
    int legs = 3;
    boolean canWalk = true;
    boolean canFly = true;

    Animal(String name, int legs, boolean canFly, boolean canWalk) {
        this.name = name;
        this.legs = legs;
        this.canFly = canFly;
        this.canWalk = canWalk;
    }

    void displayData() {
        System.out.println("animal name is " + name);
        System.out.println("this animal have " + legs + " legs");
        System.out.println("can this animal walk ? " + canWalk);
        System.out.println("can this animal fly ? " + canFly);
    }
}

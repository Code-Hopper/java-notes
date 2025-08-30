class Animals {

    String name;
    int legs;
    boolean canWalk;
    boolean canFly;
    boolean canSwim;
    String type;

    Animals(String name, int legs, boolean canWalk, boolean canFly, boolean canSwim, String type) {
        this.name = name;
        this.legs = legs;
        this.canWalk = canWalk;
        this.canFly = canFly;
        this.canSwim = canSwim;
        this.type = type;
    }

    void info() {
        System.out.println(name + " is of " + type + " type animal !");
        System.out.println(name + " has " + legs + " legs !");
        if (canFly) {
            System.out.println(name + " can fly ! ");
        } else {
            System.out.println(name + " can't fly ! ");
        }

        if (canWalk) {
            System.out.println(name + " can walk ! ");
        } else {
            System.out.println(name + " can't walk ! ");
        }

        if (canSwim) {
            System.out.println(name + " can swim ! ");
        } else {
            System.out.println(name + " can't swim ! ");
        }
    }
}

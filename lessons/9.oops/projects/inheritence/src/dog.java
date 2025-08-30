class dog extends Animals {

    boolean canBrak = true;

    dog(String name, int legs, boolean canWalk, boolean canFly, boolean canSwim, String type) {
        super(name, legs, canWalk, canFly, canSwim, type);
    }
    
    void brak() {
        if (canBrak) {
            System.out.println(name + " : bhau bhau bhau !");
        } else {
            System.out.println("sorry i can't brak !");
        }
    }
}

class pug extends dog {
    pug(String name, int legs, boolean canWalk, boolean canFly, boolean canSwim, String type) {
        super(name, legs, canWalk, canFly, canSwim, type);
    }

    void doPugThings() {
        System.out.println("i'm " + name + " i'm a pug doing pug things !");
    }
}

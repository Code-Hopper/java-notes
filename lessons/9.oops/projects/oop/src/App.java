public class App {
    public static void main(String[] args) throws Exception {

        Animal animal1 = new Animal("dog",4,false,true);

        Animal animal2 = new Animal("cat",4,false,true);
        
        Animal animal3 = new Animal("bird",2,true,true);
        // Animal animal2 = new Animal();
        // Animal animal3 = new Animal();
        // Animal animal4 = new Animal();

        // System.out.println(animal1.name);
        // System.out.println(animal1.legs);
        // System.out.println(animal1.canFly);
        // System.out.println(animal1.canWalk);

        animal1.displayData();

        animal2.displayData();

        animal3.displayData();

    }
}

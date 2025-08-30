public class App {
    public static void main(String[] args) throws Exception {

        dog tommy = new dog("tommy", 4, true, false, true, "domastic");
        dog tommy2 = new dog("tommy2", 4, true, false, true, "domastic");

        pug vodaphone = new pug("sheru", 4, true, false, true, "domastic");

        tommy.brak();

        tommy.info();

        tommy2.info();

        vodaphone.brak();
        vodaphone.info();
        vodaphone.doPugThings();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Example obj1 = new Example();
        obj1.method();
        System.out.println(obj1.getData());

        obj1.setData(123456);

        System.out.println(obj1.getData());
    }
}

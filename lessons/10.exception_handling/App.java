import java.lang.ArithmeticException;

public class App {
    public static void main(String[] args) {
        // try _ catch block
        try {
            int num1 = 10;
            int num2 = 0;
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("an exception occured !");
            // System.out.println(e);
            e.printStackTrace();
        }
    }
}

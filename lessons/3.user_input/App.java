import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Some Data : ");

        String data = scan.nextLine();

        // char data = scan.next();

        // int data= scan.nextInt();

        // float data = scan.nextFloat();

        // double data = scan.nextDouble();

        // boolean data = scan.nextBoolean();

        System.out.println("user has entred : " + data + " ! ");
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // wap in java to check weather user is eligible for driving or not
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Age");
        int age = scanner.nextInt();
        if(age > 18){
            System.out.println("You is eligible to drive !");
        }else{
            System.out.println("You are not eligible to drive");
        }
    }    
}

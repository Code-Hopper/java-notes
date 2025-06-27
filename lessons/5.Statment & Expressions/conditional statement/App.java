import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // // wap in java to check weather user is eligible for driving or not
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Please Enter Your Age");
        // int age = scanner.nextInt();
        // if(age > 18){
        // System.out.println("You is eligible to drive !");
        // }else{
        // System.out.println("You are not eligible to drive");
        // }

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    System.out.println("A is greatest !");
                } else {
                    System.out.println("D is greatest ! line 1");
                }
            } else if (c > d) {
                System.out.println("C is greatest !");
            } else {
                System.out.println("D is greatest ! line 2");
            }
        } else if (b > c) {
            if (b > d) {
                System.out.println("B is greatest !");
            } else {
                System.out.println("D is greatest ! line 3");
            }
        } else if (c > d) {
            System.out.println("C is greatest !");
        } else {
            System.out.println("D is greatest ! line 4");
        }

    }
}

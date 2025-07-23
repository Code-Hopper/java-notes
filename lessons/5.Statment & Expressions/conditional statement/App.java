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

        // int a = 100;
        // int b = 100;
        // int c = 100;
        // int d = 100;

        // if ((a > b) && (a > c) && (a > d)) {
        // System.out.println("A is greater than B,C & D");
        // } else if ((b > a) && (b > c) && (b > d)) {
        // System.out.println("B is greater than A,C & D");
        // } else if ((c > a) && (c > b) && (c > d)) {
        // System.out.println("C is greater than A,B & D");
        // } else if ((d > a) && (d > b) && (d > c)) {
        // System.out.println("D is greater than A,B & C");
        // } else {
        // System.out.println("All are equal !");
        // }

        // if (a > b) {
        // if (a > c) {
        // if (a > d) {
        // System.out.println("A is greatest !");
        // } else {
        // System.out.println("D is greatest ! line 1");
        // }
        // } else if (c > d) {
        // System.out.println("C is greatest !");
        // } else {
        // System.out.println("D is greatest ! line 2");
        // }
        // } else if (b > c) {
        // if (b > d) {
        // System.out.println("B is greatest !");
        // } else {
        // System.out.println("D is greatest ! line 3");
        // }
        // } else if (c > d) {
        // System.out.println("C is greatest !");
        // } else {
        // System.out.println("D is greatest ! line 4");
        // }

        // String name = new Scanner(System.in).nextLine();

        // if (name.isEmpty()) {
        // System.out.println("user din't send name !");
        // } else {
        // System.out.println("user name is , " + name);
        // }

        // System.out.println("Enter Choice 1 - 4 : ");

        // int choice = new Scanner(System.in).nextInt();
        // switch (choice) {
        // case 1:
        // System.out.println("case 1 is selected !");
        // break;
        // case 2:
        // System.out.println("case 2 is selected !");
        // break;
        // case 3:
        // System.out.println("case 3 is selected !");
        // break;
        // case 4:
        // System.out.println("case 4 is selected !");
        // break;
        // default:
        // System.out.println("none of the above is selected !");
        // }

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter Number 1 : ");
        // int number1 = scan.nextInt();
        // System.out.println("Enter Number 2 : ");
        // int number2 = scan.nextInt();

        // System.out.println("enter choice 1: Addition, 2: Subtraction , 3:
        // Multiplication, 4: Division, 5: Modulus : ");

        // int choice = scan.nextInt();

        // switch (choice) {
        // case 1:
        // System.out.println("Addition of numbers is : " + (number1 + number2));
        // break;
        // case 2:
        // System.out.println("Subtraction of numbers is : " + (number1 - number2));
        // break;
        // case 3:
        // System.out.println("Multiplication of numbers is : " + (number1 * number2));
        // break;
        // case 4:
        // System.out.println("Division of numbers is : " + (number1 / number2));
        // break;
        // case 5:
        // System.out.println("Modulus of numbers is : " + (number1 % number2));
        // break;

        // default:
        // System.out.println("wrong choice entered Please Enter Choice from (1 - 5)
        // !");
        // break;
        // }

        // int age = 20;
        // boolean learning = false;

        // if(age > 18 || learning == true){
        // System.out.println("can drive");
        // }else{
        // System.out.println("Can't drive");
        // }

        // while

        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);
        // System.out.println(4);
        // System.out.println(5);
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // System.out.println(1000);

        // int number = 0;

        // int data = 0;

        // while(number <= 1000){
        // System.out.println(number);
        // number++;
        // }

        // addition of digits of any number

        // 123456 = 21

        // int sum = 0;

        // int number = 123456789;

        // int digit = 0;

        // while (number != 0) {
        // digit = number % 10;
        // sum = sum + digit;
        // number = number / 10;
        // }

        // System.out.println("the sum is : " + sum);

        // int rows = 5;

        // int totalSpace = 5;

        // for (int i = 0; i < rows; i++) {
        // // for space
        // for (int space = 0; space < totalSpace - 1; space++) {
        // System.out.print("  ");
        // }
        // // for star
        // for (int star = 0; star <= i; star++) {
        // System.out.print(" * ");
        // }
        // System.out.println("");
        // totalSpace--;
        // }

        int rows = 5;

        int totalSpace = 5;

        for (int i = 0; i < rows; i++) {
            // for space
            for (int space = 0; space < totalSpace - 1; space++) {
                System.out.print("   ");
            }
            // for star left side
            for (int leftstar = 0; leftstar <= i; leftstar++) {
                System.out.print(" * ");
            }

            // for star right side
            for (int rightstar = 1; rightstar <= i; rightstar++) {
                System.out.print(" * ");
            }

            System.out.println("");
            totalSpace--;
        }
    }
}
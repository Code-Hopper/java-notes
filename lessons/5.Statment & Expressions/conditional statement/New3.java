import java.util.Scanner;

public class New3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Your Age in Years ! : ");

        int age = scan.nextInt();

        System.out.println("Do You Have a License ! : (true/false) ");

        boolean license = scan.nextBoolean();

        System.out.println("Do You Know Someone ! : (true/false) ");

        boolean pohoch = scan.nextBoolean();

        // if(condition){
        // if(condition){
        // statement;
        // }
        // }else if(condition){
        // statement;
        // }else{
        // statement
        // }

        if (age > 18) {
            if (license) {
                System.out.println("You Can Drive !");
            } else {
                System.out.println("you are required to have a license to drive !");
            }
        } else if (pohoch) {
            System.out.println("ok you can drive now !");
        } else {
            System.out.println("you don't have pohoch / eligible age to drive !");
        }

        System.out.println("program completed !");

    }
}

public class new2 {
    public static void main(String[] args) {
        int number = 153;
        int original = number;

        int sum = 0;
        int d = 0;

        while(number != 0){
            d= number %10;
            sum = sum + (d*d*d);
            number = number /10;
        }

        System.out.println("sum of cube of digits of number : " + original + " is : " + sum);

        if(sum == original){
            System.out.println(original + " number is an armstrong number !");
        }else{
            System.out.println(original + " number is not an armstrong number !");
        }

    }
}

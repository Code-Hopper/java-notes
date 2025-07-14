public class New {
    public static void main(String[] args) {
        int start = 10;
        int end = 1000;
        int count = 0;
        while (start <= end) {
            int number = start;
            int original = number;
            int d = 0;
            int rev = 0;

            while (number != 0) {
                d = number % 10;
                rev = rev * 10 + d;
                number = number / 10;
            }

            if (original == rev) {
                System.out.println(original + " is a palindrome !");
                count++;
            }
            start++;
        }

        System.out.println("from " + 10 + " to " + 1000 + " there are " + count);

    }
}
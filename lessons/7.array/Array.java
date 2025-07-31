public class Array {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        // System.out.println(numbers[0]);
        // System.out.println(numbers[1]);
        // System.out.println(numbers[2]);
        // System.out.println(numbers[3]);
        // System.out.println(numbers[4]);

        for (int index = 0; index < 5; index++) {
            if (numbers[index] % 2 != 0) {
                System.out.println(numbers[index]);
            }
        }
    }
}

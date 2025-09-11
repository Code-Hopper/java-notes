import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5 };
        try {
            System.out.println(Arrays.toString(numbers));
            System.out.println(numbers[1]);
            System.out.println(numbers[3]);
            System.out.println(numbers[4]);
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("trying to access more than index !");
            e.printStackTrace();
        }
    }
}

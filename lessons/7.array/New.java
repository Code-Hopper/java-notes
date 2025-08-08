import java.util.Arrays;

public class New {

    public static int[] AddElementAtEnd(int[] arr, int element) {
        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static int[] AddElementAtStart(int[] arr, int element) {
        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i+1] = arr[i];
        }

        newArray[0] = element;
        return newArray;
    }

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3 };

        numbers = AddElementAtEnd(numbers, 4);
        numbers = AddElementAtEnd(numbers, 5);
        numbers = AddElementAtEnd(numbers, 6);
        numbers = AddElementAtEnd(numbers, 7);
        numbers = AddElementAtEnd(numbers, 8);

        numbers = AddElementAtStart(numbers, 9);
        numbers = AddElementAtStart(numbers, 10);
        numbers = AddElementAtStart(numbers, 11);
        numbers = AddElementAtStart(numbers, 12);

        System.out.println(Arrays.toString(numbers));

    }
}

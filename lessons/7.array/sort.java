import java.util.Arrays;

public class sort {

    public static int[] bubbleSort(int arr[], String type) {

        int[] sortedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (type == "A") {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swap = true;
                    }
                } else if (type == "D") {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swap = true;
                    }
                }
            }
            if (!swap)
                break;
        }

        sortedArray = arr;

        printArray(arr);

        return sortedArray;
    }

    public static String[] bubbleSortString(String[] arr, String type) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swap = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (type.equals("A")) { // Ascending
                    if (arr[j].compareTo(arr[j + 1]) > 0) {
                        String temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swap = true;
                    }
                } else if (type.equals("D")) { // Descending
                    if (arr[j].compareTo(arr[j + 1]) < 0) {
                        String temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swap = true;
                    }
                }
            }

            if (!swap)
                break; // already sorted
        }

        printArray(arr);

        return arr;
    }

    public static int[] selectionSort(int[] arr, String type) {

        for (int i = 0; i < arr.length; i++) {

            int minIndex = i;

            if (type == "A") {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[minIndex] > arr[j]) {
                        minIndex = j;
                    }
                }
            } else if (type == "D") {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[minIndex] < arr[j]) {
                        minIndex = j;
                    }
                }
            }
            // swap the elements from minIndex and J'th index

            int temp = 0;
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

        printArray(arr);

        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.println("]");
    }

    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        int[] numbers = { 3, 1, 5, 4, 2 };

        String[] names = { "Zyan", "Bhavesh", "Amey", "Elephant", "arnav" };

        numbers = bubbleSort(numbers, "D");

        names = bubbleSortString(names, "A");

        // System.out.println(Arrays.toString(numbers));
        // System.out.println(Arrays.toString(names));

        numbers = selectionSort(numbers, "D");
        // System.out.println("selection sorted numbers : " + Arrays.toString(numbers));
    }

}

public class search {

    public static boolean linearSearch(int[] arr, int search) {

        boolean result = false;

        int position = 0;

        int steps = 0;

        for (int index = 0; index < arr.length; index++) {
            ++steps;
            if (arr[index] == search) {
                result = true;
                position = index + 1;
                break;
            }
        }
        if (result) {
            System.out.println(
                    "we found the element " + search + ", at position " + position + " in " + steps + " steps !");
        } else {
            System.out.println(
                    "we not found the element " + search + ", at position any position in " + steps + " steps !");
        }

        return result;
    }

    public static boolean binarySearch(int[] arr, int search) {

        boolean result = false;

        int position = 0;

        int LB = 0;
        int UB = arr.length - 1;

        int steps = 0;

        while (LB <= UB) {

            ++steps;

            int midPoint = (LB + UB) / 2;

            if (arr[midPoint] == search) {
                result = true;
                position = midPoint + 1;
                break;
            }

            if (search < arr[midPoint]) {
                UB = midPoint - 1;
            }

            if (search > arr[midPoint]) {
                LB = midPoint + 1;
            }

        }

        if (result) {
            System.out.println(
                    "we found the element " + search + ", at position " + position + " in " + steps + " steps !");
        } else {
            System.out.println(
                    "we not found the element " + search + ", at position any position in " + steps + " steps !");
        }

        return result;
    }

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        linearSearch(numbers, 1);

        binarySearch(numbers, 1);

        // linear, binary search algo

    }
}

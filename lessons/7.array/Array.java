public class Array {
    public static void main(String[] args) {
        // int[] numbers = { 1, 2, 3, 4, 5 };

        // System.out.println(numbers[0]);
        // System.out.println(numbers[1]);
        // System.out.println(numbers[2]);
        // System.out.println(numbers[3]);
        // // System.out.println(numbers[4]);

        // for (int index = 0; index < 5; index++) {
        // if (numbers[index] % 2 != 0) {
        // System.out.println(numbers[index]);
        // }
        // }

        // String[] names = new String[5];

        // names[0] = "name1";
        // names[1] = "name2";
        // names[2] = "name3";
        // names[3] = "name4";
        // names[4] = "name5";

        // for (int i = 0; i < 5; i++) {
        // System.out.println(names[i]);
        // System.out.println(names.length);
        // System.out.println(numbers.length);

        // for (int number : numbers) {
        // System.out.println(number);
        // }

        // for (String name : names) {
        // System.out.println(name);
        // }}

        // System.out.println(names.length);
        // System.out.println(numbers.length);

        // for (int number : numbers) {
        // System.out.println(number);
        // }

        // for (String name : names) {
        // System.out.println(name);
        // }

        int[][] numbers = {
                { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8 }, { 9 }, { 10, 11, 12, 13, 14, 15 }
        };

        numbers[0][0] = 1000;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }

        System.out.println(numbers[0][0]);

    }
}

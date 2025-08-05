import java.util.Arrays;

public class App {

    public static void doSomething() {
        System.out.println("hello from doSomething function !");
    }

    public static void greet(String name, int age) {
        System.out.println("Hello ! " + name + " you are " + age + " years old !");
    }

    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static String joinName(String fName, String lName) {
        return fName + " " + lName;
    }

    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        // doSomething();
        // doSomething();
        // doSomething();
        // doSomething();

        // greet("amey", 22);
        // greet("tanu", 18);
        // greet("devashree", 23);

        System.out.println(add(100, 200));
        System.out.println(add(500, 200));
        System.out.println(add(100, 500));
        System.out.println(joinName("amey", "khondekar"));

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int[] sq_numbers = new int[10];

        for (int index = 0; index < 10; index++) {
            sq_numbers[index] = square(numbers[index]);
        }

        System.out.println(Arrays.toString(sq_numbers));

    }
}

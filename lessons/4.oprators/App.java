public class App {
    public static void main(String[] args) {

        int number1 = 123;
        int number2 = 456;

        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 / number2);
        System.out.println(number1 * number2);
        System.out.println(number1 % number2);

        number1++;
        System.out.println(number1);

        int num = 10;
        num += 10;
        System.out.println(num);
        num -= 10;
        System.out.println(num);

        // pre and post increemen and dcreement

        int data = 10;

        // data++;// post //data = data + 1 11
        // ++data;// pre //data = data + 1 11

        // System.out.println(data++); // 11
        // System.out.println(data++); // 11
        // System.out.println(data); // 11

        System.out.println(++data); // 11
        System.out.println(++data); // 11
        System.out.println(data); // 11

    }
}

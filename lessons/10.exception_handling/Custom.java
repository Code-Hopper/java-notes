public class Custom {

    public static void doSomething(int data) throws Exception {
        if (data < 10) {
            System.out.println("all ok !");
        } else {
            throw new Exception("Data is not less than 10 !");
        }
    }

    public static void main(String[] args) {
        System.out.println("doing something !");
        try {
            doSomething(18);
        } catch (Exception e) {
            System.out.println("an exception occured !");
            System.out.println(e);
        } finally {
            System.out.println("programm completed !");
        }
    }

}

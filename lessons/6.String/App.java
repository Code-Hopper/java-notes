public class App {
    public static void main(String[] args) {
        String Fname = "  Amey   ";
        String Lname = "Khondkekar";

        // concatenation | joining 2 strings
        System.out.println(Fname + Lname);

        String fullName = Fname + " " + Lname;

        System.out.println(Fname.length());

        System.out.println(Lname.length());

        // space is also considered as a char

        System.out.println(fullName.length());

        System.out.println(fullName);

        Fname = Fname.trim();

        System.out.println(Fname.length());

        // how to create a new string out of a string

        String name = "Amey Khondekar";

        // String newName = name.substring(startIndex, endIndex);

        String newName = name.substring(0, 4);

        String newName2 = name.substring(4, name.length());

        System.out.println(newName);

        System.out.println(newName2);

        String data = "THIS IS SOME DATA 1";
        System.out.println(data);

        // to transform string into lowercase

        data = data.toLowerCase();

        System.out.println(data);

        String data2 = "this is some data 2";

        // to transform string into uppercase

        data2 = data2.toUpperCase();

        System.out.println(data2);

        String password = "password";

        // for checking to strings }|returns boolean

        System.out.println(password.equals("password"));

        String data3 = "This is some new data";

        data3 = data3.replace("is","was");

        System.out.println(data3);

    }
}
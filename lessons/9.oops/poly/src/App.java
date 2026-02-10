abstract class Cars {

    private int uniqueNmber;

    abstract void start();

    // getter and setter
    void setUniqueNumber(int number) {
        this.uniqueNmber = number;
    }

    int getUniqueNumber() {
        return this.uniqueNmber;
    }

    void stop() {
        System.out.println("car is stoped !");
    }

    void reverse() {
        System.out.println("car is reversing !");
    }
}

class suzuki extends Cars {
    @Override
    void start() {
        System.out.println("suzuki starts with a key !");
    }
}

class tesla extends Cars {
    @Override
    void start() {
        System.out.println("tesla starts with button !");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        suzuki car1 = new suzuki();
        car1.start();
        car1.stop();
        car1.reverse();
        tesla car2 = new tesla();
        car2.start();
        car2.stop();
        car2.reverse();

        // car2.uniqueNmber = 456;
        // System.out.println(car2.uniqueNmber);

        car2.setUniqueNumber(123);
        System.out.println("car 2 unique number is " + car2.getUniqueNumber());

    }
}

// car start(),stop(),reverse()
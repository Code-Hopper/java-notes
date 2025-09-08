class Example{
    void method(){
        System.out.println("this method is from Example class");
    }
}

class child extends Example{
    void method(int number){
        System.out.println("this method is from child class");
        System.out.println(number);
    }
    void method(){
        System.out.println("this method is from child class");
    }
}
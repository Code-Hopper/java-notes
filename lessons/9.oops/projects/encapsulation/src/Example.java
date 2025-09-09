class Example {
    private int data = 123;

    void method() {
        System.out.println("doing something !");
    }

    // to give access/value of private data we would getter and setter

    public int getData() {
        return this.data;
    }

    public int setData(int value) {
        this.data = value;
        return 0;
    }

}
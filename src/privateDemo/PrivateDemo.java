package privateDemo;

class PrivateDemo {
    private PrivateDemo() {
    }

    private int number = 10;
    private void privateMsg() {
        System.out.println("Hello!");
    }
}

class PrivateRun {
    public static void main(String[] args) {
        //Contructor được khai báo private nên không thể truy cập.
        PrivateDemo obj = new PrivateDemo();
        //Do biến number được khai báo private nên không thể truy cập.
        System.out.println(obj.number);
        //Phương thức message được khai báo private nên không thể truy cập.
        obj.privateMsg();
    }
}

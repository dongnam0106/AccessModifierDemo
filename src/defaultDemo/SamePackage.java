package defaultDemo;

public class SamePackage {
    public static void main(String[] args) {
        DefaultDemo obj = new DefaultDemo();
        obj.defaultMsg();
    }
    //Do 2 class cùng chung package nên chúng ta có thể truy cập contructor khi chúng được khai báo default.
}

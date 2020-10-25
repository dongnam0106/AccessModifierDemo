package notSamePackage;

import defaultDemo.DefaultDemo;

public class DefaultTest {
    public static void main(String[] args) {
        DefaultDemo obj = new DefaultDemo();
        obj.defaultMsg();
    }
    //Class này không cùng package với class DefaultDemo nên không thể truy cập phương thức và contructor.
}

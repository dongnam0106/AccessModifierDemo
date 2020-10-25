package notSamePackage;

import protectedDemo.ProtectedDemo;

public class ExtendsClassProtected extends ProtectedDemo {
    public static void main(String[] args) {
        ProtectedDemo protectedDemo = new ProtectedDemo();
        protectedDemo.protectedMsg();
    }
    //Em extends mà không thể gọi phương thức protectedMsg chị ạ! Nên em đổi sang khai báo public luôn ạ.
}

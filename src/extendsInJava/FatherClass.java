package extendsInJava;

class FatherClass {
    void father() {
        System.out.println("Ông");
    }
}

class FatherClass2 extends FatherClass {
    void father2() {
        System.out.println("Bố");
    }
}

class SonClass extends FatherClass2 {
    void son() {
        System.out.println("Con");
    }
}

class ExtendsRun {
    public static void main(String[] args) {
        SonClass sonClass = new SonClass();
        sonClass.father();
        sonClass.father2();
        sonClass.son();
    }
    //Do SonClass kế thừa từ FatherClass2 mà FatherClass2 kế thừa FatherClass nên nó được kế thừa toàn bộ thuộc tính và phương thức,... của cả 2 class.
    //1 class cha có thể có nhiều class con. Nhưng class con chỉ có thể có 1 class cha.
}

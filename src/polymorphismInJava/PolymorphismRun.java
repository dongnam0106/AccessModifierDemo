package polymorphismInJava;

public class PolymorphismRun {
    public static void main(String[] args) {
        MyInfoClass myInfoClass = new MyInfoClass("Nam","23");
        InfoTeacherClass infoTeacherClass = new InfoTeacherClass("Kieu Anh","28");
        System.out.println("My name is " + myInfoClass.getInfoName() + ", " + myInfoClass.getInfoOld() + " old!");
        System.out.println("My name is " + infoTeacherClass.getInfoName() + ", " + infoTeacherClass.getInfoOld() + " old!");
    }
}

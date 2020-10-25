package polymorphismInJava;

public class InfoTeacherClass extends InfoClass {
    public InfoTeacherClass(String name, String old) {
        super(name,old);
    }

    @Override
    public String getInfoName() {
        return "Kieu Anh";
    }

    @Override
    public String getInfoOld() {
        return "28";
    }
}

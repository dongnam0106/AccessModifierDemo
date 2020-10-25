package polymorphismInJava;

public class MyInfoClass extends InfoClass {
    public MyInfoClass(String name, String old) {
        super(name, old);
    }

    @Override
    public String getInfoName() {
        return "Nam";
    }

    @Override
    public String getInfoOld() {
        return "23";
    }
}

package polymorphismInJava;

public abstract class InfoClass {
    private String name;
    private String old;

    public InfoClass(String name, String old) {
        this.name = this.getInfoName();
        this.old = this.getInfoOld();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public abstract String getInfoName();
    public abstract String getInfoOld();
}

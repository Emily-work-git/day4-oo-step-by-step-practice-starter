package oo;

public class Student extends Person {
    protected static final String OCCUPATION = "student";
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    public boolean isIn(Klass klass) {
        return this.klass != null && this.klass.equals(klass);
    }

    @Override
    public String introduce() {
        String introduction = super.introduce()+" I am a " + OCCUPATION + ".";
        if (klass != null) {
            introduction += " I am in class " + klass.getClassNumber() + ".";
        }
        return introduction;
    }

    public Klass getKlass() {
        return klass;
    }

}

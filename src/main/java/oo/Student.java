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
        return this.klass != null && this.klass.getClassNumber() == klass.getClassNumber();
    }

    @Override
    public String introduce() {
        String occupationIntroduction = " I am a " + OCCUPATION + ".";
        String classIntroduction = " I am in class " + klass.getClassNumber() + ".";
        return super.introduce() + occupationIntroduction + classIntroduction;
    }

    public Klass getKlass() {
        return klass;
    }

}

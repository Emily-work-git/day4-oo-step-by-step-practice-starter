package oo;

public class Student extends Person{
    protected static final String OCCUPATION = "student";
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    public boolean isIn(Klass klass) {
        return this.klass!= null && this.klass.getClassNumber()==klass.getClassNumber();
    }

    @Override
    public String introduce(){
        return ("My name is " + name + ". I am " + age + " years old. I am a " + OCCUPATION + ". I am in class "+klass.getClassNumber()+".");
    }

}

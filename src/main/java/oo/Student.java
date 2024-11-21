package oo;

public class Student extends Person{
    protected static final String OCCUPATION = "student";

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce(){
        return ("My name is " + name + ". I am " + age + " years old. I am a " + OCCUPATION + ".");
    }
}

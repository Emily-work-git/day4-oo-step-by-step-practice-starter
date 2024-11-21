package oo;

import java.util.List;

public class Teacher extends Person{
    protected static final String OCCUPATION = "teacher";
    protected List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce(){
        String occupationIntroduction = " I am a "+ OCCUPATION+".";
        return super.introduce() + occupationIntroduction;
    }
}
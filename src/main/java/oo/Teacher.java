package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    protected static final String OCCUPATION = "teacher";
    protected List<Klass> classes = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        String introduction = super.introduce() + " I am a " + OCCUPATION + ".";
        String classIntroduction = " I teach Class ";
        if (!classes.isEmpty()) {
            classIntroduction += this.classes.stream()
                    .map(i -> String.valueOf(i.getClassNumber()))
                    .collect(Collectors.joining(", ")) + '.';
            introduction += classIntroduction;
        }
        return introduction;
    }

    public void assignTo(Klass klass) {
        if (klass != null) {
            this.classes.add(klass);
        }
    }

    public boolean belongsTo(Klass klass) {
        return klass != null && this.classes.contains(klass);
    }

    public boolean isTeaching(Student student) {
        return belongsTo(student.getKlass());
    }
}
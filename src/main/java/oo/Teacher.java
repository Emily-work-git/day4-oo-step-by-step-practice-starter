package oo;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    protected static final String OCCUPATION = "teacher";
    protected List<Klass> classes = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        String occupationIntroduction = " I am a " + OCCUPATION + ".";
        String classIntroduction = " I teach Class ";

        List<Integer> classNumbers = this.classes.stream().map(Klass::getClassNumber).toList();
        for (int i = 0; i < classNumbers.size(); i++) {
            if (i != classNumbers.size() - 1) {
                classIntroduction = String.join(classIntroduction, classNumbers.get(i) + ",");
            } else {
                classIntroduction = String.join(classIntroduction, classNumbers.get(i) + ".");
            }
        }
        return super.introduce() + occupationIntroduction;

    }

    public void assignTo(Klass klass) {
        if (klass != null) {
            this.classes.add(klass);
        }
    }

    public boolean belongsTo(Klass klass) {
        return klass != null && this.classes.contains(klass);
    }
    public boolean isTeaching(Student student){
        return belongsTo(student.getKlass());
    }
}
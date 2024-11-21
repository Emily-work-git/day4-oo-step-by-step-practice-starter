package oo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Klass {
    private int number;
    private Student leader;
    private Set<Teacher> teachers;
    private Set<Student> students;

    public Klass(int number) {
        this.number = number;
        this.teachers = new HashSet<>();
        this.students = new HashSet<>();
    }

    public int getClassNumber() {
        return this.number;
    }

    public Student getLeader() {
        return this.leader;
    }

    public boolean isLeader(Student student) {
        return !Objects.isNull(leader) && student.isIn(this) && leader.equals(student);
    }

    public void attach(Person person) {
        if (person instanceof Teacher teacher) {
            teachers.add(teacher);
        } else if (person instanceof Student student) {
            students.add(student);
        }
    }

    public void assignLeader(Student classLeader) {
        if (!Objects.isNull(classLeader) && canAssignLeader(classLeader)) {
            this.leader = classLeader;
        } else {
            System.out.print("It is not one of us.");
        }

        teachers.forEach(teacher -> teacher.acknowledgeLeaderAssignment(this));
        students.stream().filter(student -> student != classLeader).forEach(student -> student.acknowledgeLeaderAssignment(this));

    }

    public boolean canAssignLeader(Student student) {
        return Objects.nonNull(student) && student.isIn(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) return false;

        Klass anotherClass = (Klass) obj;
        return this.number == anotherClass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

}



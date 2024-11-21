package oo;

import java.util.Objects;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getClassNumber() {
        return this.number;
    }

    public boolean isLeader(Student student) {
        return !Objects.isNull(leader) && student.isIn(this) && leader.equals(student);
    }

    public void assignLeader(Student student) {
        if (!Objects.isNull(student) && canAssignLeader(student)) {
            this.leader = student;
        } else {
            System.out.print("It is not one of us.");
        }
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



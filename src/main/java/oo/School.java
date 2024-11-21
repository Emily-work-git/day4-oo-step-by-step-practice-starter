package oo;

import java.util.HashSet;
import java.util.Set;

public class School {
    private Set<Teacher> teachers;
    private Set<Student> students;

    public School() {
        this.teachers = new HashSet<>();
        this.students = new HashSet<>();
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void startSchool() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher.introduce());
        }
        for (Student student : students) {
            System.out.println(student.introduce());
        }
    }
}
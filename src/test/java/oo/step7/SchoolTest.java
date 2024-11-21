package oo.step7;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import oo.Klass;
import oo.School;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchoolTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    private String systemOut() {
        return outContent.toString();
    }
    @Test
    public void should_return_correct_output_when_there_are_two_teachers_and_two_students() {
        School school = new School();
        Teacher alice = new Teacher(1, "Alice", 30);
        Teacher Bob = new Teacher(2, "Bob", 40);
        Student Charlie = new Student(3, "Charlie", 18);
        Student David = new Student(4, "David", 19);

        school.startSchool();
        school.addTeacher(alice);
        school.addTeacher(Bob);
        school.addStudent(Charlie);
        school.addStudent(David);
        school.startSchool();

        String expectedOutput = "My name is Alice. I am 30 years old. I am a teacher.\r\n" +
                "My name is Bob. I am 40 years old. I am a teacher.\r\n" +
                "My name is Charlie. I am 18 years old. I am a student.\r\n" +
                "My name is David. I am 19 years old. I am a student.\r\n";
        assertThat(systemOut()).isEqualTo(expectedOutput);
    }
    @Test
    public void should_return_correct_output_when_there_are_only_one_teacher_and_two_students(){
        School school = new School();
        Teacher alice = new Teacher(1, "Alice", 30);
        Student Charlie = new Student(3, "Charlie", 18);
        Student David = new Student(4, "David", 19);

        school.startSchool();
        school.addTeacher(alice);
        school.addStudent(Charlie);
        school.addStudent(David);
        school.startSchool();

        String expectedOutput = "My name is Alice. I am 30 years old. I am a teacher.\r\n" +
                "My name is Charlie. I am 18 years old. I am a student.\r\n" +
                "My name is David. I am 19 years old. I am a student.\r\n";
        assertThat(systemOut()).isEqualTo(expectedOutput);
    }
    @Test
    public void should_return_correct_output_when_there_are_only_two_students(){
        School school = new School();
        Student Charlie = new Student(3, "Charlie", 18);
        Student David = new Student(4, "David", 19);

        school.startSchool();
        school.addStudent(Charlie);
        school.addStudent(David);
        school.startSchool();

        String expectedOutput = "My name is Charlie. I am 18 years old. I am a student.\r\n" +
                "My name is David. I am 19 years old. I am a student.\r\n";
        assertThat(systemOut()).isEqualTo(expectedOutput);
    }
    @Test
    public void should_return_correct_output_when_there_are_only_one_teacher(){
        School school = new School();
        Teacher alice = new Teacher(1, "Alice", 30);

        school.startSchool();
        school.addTeacher(alice);
        school.startSchool();

        String expectedOutput = "My name is Alice. I am 30 years old. I am a teacher.\r\n";
        assertThat(systemOut()).isEqualTo(expectedOutput);
    }
    @Test
    public void should_return_correct_output_when_there_are_no_teacher_and_no_student(){
        School school = new School();

        school.startSchool();
        school.startSchool();

        String expectedOutput = "";
        assertThat(systemOut()).isEqualTo(expectedOutput);
    }
}

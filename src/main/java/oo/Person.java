package oo;

public class Person {
    protected String name;
    protected int age;
    protected int id;

    public Person(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }

    public void acknowledgeLeaderAssignment(Klass klass) {
        if (this instanceof Student) {
            System.out.println(String.format("I am %s, student of Class %d. I know %s become Leader.", name, klass.getClassNumber(), klass.getLeader().name));
        } else if (this instanceof Teacher) {
            System.out.println(String.format("I am %s, teacher of Class %d. I know %s become Leader.", name, klass.getClassNumber(), klass.getLeader().name));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;

        Person anotherPerson = (Person) obj;
        return this.id == anotherPerson.id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}

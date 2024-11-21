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
        return "  " + name + ". I am " + age + " years old.";
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

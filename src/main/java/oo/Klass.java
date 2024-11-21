package oo;

public class Klass {
    private int number;

    public Klass(int number) {
        this.number = number;
    }
    public int getClassNumber() {
        return this.number;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;

        Klass anotherClass = (Klass) obj;
        return this.number == anotherClass.number;
    }

    @Override
    public int hashCode() {
        return this.number;
    }
}

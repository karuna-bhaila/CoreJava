package classwork.Classes;

import java.util.Objects;

public class Student {
    int id;
    String name;

    public Student(int i, String n)
    {
        id = i;
        name = n;
    }

    public Student()
    {
        this(0, "");
    }

    @Override
    public boolean equals(Object o)
    {
        boolean equal = false;
        if (this == o) // same memory reference
            equal = true;
        if (o == null || getClass() != o.getClass()) // o is not an instance of student
            equal = false;
        Student s = (Student)o;
        if (this.id == s.id && Objects.equals(name, s.name)) // value comparison
            equal = true;

        return equal;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name);
    }
}

package classwork.Classes;

public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Jack");
        Student s2 = new Student(2, "Jim");
        Student s3 = new Student(1, "Jack");
        Student s4 = s3;

        ////////////////////////////////////////////////////////////
        //different memory addresses
        if(s1.equals(s3))
            System.out.println("S1 & S3 are the same student");
        else
            System.out.println("S1 & S3 are different students");

        if (s1 == s3)
            System.out.println("S1 & S3 are the same student");
        else
            System.out.println("S1 & S3 are different students");

        ////////////////////////////////////////////////////////////
        if(s1.equals(s2))
            System.out.println("S1 & S2 are the same student");
        else
            System.out.println("S1 & S2 are different students");

        if (s1 == s2)
            System.out.println("S1 & S2 are the same student");
        else
            System.out.println("S1 & S2 are different students");

        ////////////////////////////////////////////////////////////
        //points to the same memory reference
        if(s3.equals(s4))
            System.out.println("S3 & S4 are the same student");
        else
            System.out.println("S3 & S4 are different students");

        if (s3 == s4)
            System.out.println("S3 & S4 are the same student");
        else
            System.out.println("S3 & S4 are different students");
    }
}

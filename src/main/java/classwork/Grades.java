package classwork;

import java.util.Scanner;

public class Grades
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subjects = {"English", "Math", "Physics", "Computer", "Biology"};
        int grade;
        int totalGrade = 0;
        double perGrade;

        System.out.println("Enter grades.");
        for(String elem:subjects)
        {
            System.out.print(elem + ": ");
            grade = sc.nextInt();
            totalGrade += grade;
        }

        perGrade = totalGrade / 5;

        if(perGrade >= 60)
            System.out.println("First Division!");

        else if (perGrade >= 45)
            System.out.println("Second Division!");

        else if (perGrade >= 30)
            System.out.println("Third Division!");

        else
            System.out.println("Failed! Please retake the exam!");
    }
}

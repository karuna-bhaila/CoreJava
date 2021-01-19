package assignment;

import java.util.Scanner;

public class Warmups
{
    public static void main(String[] args)
    {
        System.out.println("This is my first program!");

        String fullname = "Karuna Bhaila";
        System.out.println(fullname.toUpperCase());

        Scanner sc = new Scanner(System.in);
        String inputName;
        System.out.print("Enter your name: ");
        inputName = sc.nextLine();
        System.out.println(inputName.toLowerCase());

        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The sum is " + (num1 + num2));

        boolean valid = true;
        while(valid)
        {
            String choice;

            sc.nextLine();
            System.out.println("\nChoose operation:\n" + "1. Add\n" + "2. Subtract\n" +
                    "3. Multiply\n" + "4. Divide\n" + "5. Quit");
            choice = sc.nextLine();

            if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4"))
            {
                System.out.println("Enter two numbers: ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
            }

            if (choice.equals("1"))
                System.out.println(num1 + " + " + num2 + " = " + Calculator.add(num1, num2));

            else if (choice.equals("2"))
                System.out.println(num1 + " - " + num2 + " = " + Calculator.sub(num1, num2));

            else if (choice.equals("3"))
                System.out.println(num1 + " * " + num2 + " = " + Calculator.mul(num1, num2));

            else if (choice.equals("4"))
                System.out.println(num1 + " / " + num2 + " = " + Calculator.div(num1, num2));

            else
                valid = false;
        }

        System.out.println("Ending warmup exercises. Goodbye!");
    }
}

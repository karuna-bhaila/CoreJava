package classwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LuckySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;

        while (number != 7)
        {
             number = getIntWithinRange(sc);
             System.out.println("Unlucky! Please try again.\n");
        }

        System.out.println("Congratulations! Lucky number 7.");
    }

    public static int getInt(Scanner sc)
    {
        int n = 0;
        boolean isValid = false;
        while (!isValid)
        {
            try
            {
                System.out.print("Enter a number between 1 & 7: ");
                n = sc.nextInt();
                isValid = true;
            } catch (InputMismatchException e){
                System.out.println("Error! Please enter an integer.");
                sc.nextLine();
            }
        }

        return n;
    }

    public static int getIntWithinRange(Scanner sc)
    {
        int n = 0;
        boolean isValid = false;

        while (!isValid)
        {
            n = getInt(sc);
            if ((n < 1) || (n > 7))
                System.out.println("Error! Number out of range.");
            else
                isValid = true;
        }

        return n;
    }
}

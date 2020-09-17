package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day2_GetNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[4];
        boolean duplicate;

        for (int i = 0; i < numbers.length; i++)
        {
            do {
                numbers[i] = getIntWithinRange(sc);
                duplicate = false;

                for (int j = i - 1; j >= 0; j--)
                {
                    if (numbers[i] == numbers[j])
                    {
                        duplicate = true;
                        System.out.println("Error! Duplicate.");
                    }
                }
            } while (duplicate);
        }

        for (int elem:numbers)
            System.out.println(elem);
    }

    public static int getInt(Scanner sc)
    {
        int n = 0;
        boolean isInt = false;

        while (!isInt)
        {
            try
            {
                System.out.print("Please enter a number between 30 to 50: ");
                n = sc.nextInt();
                isInt = true;
            } catch (InputMismatchException e) {
                System.out.println("Error! Not a number.");
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
            if ((n < 30) || (n > 50))
                System.out.println("Error! Out of range.");
            else
                isValid = true;
        }
        return n;
    }
}

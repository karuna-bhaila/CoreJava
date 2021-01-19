package classwork.Arraylists;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator {
    public static int getInt(Scanner sc, String prompt)
    {
        int input = 0;
        boolean isInt = false;

        while(!isInt)
        {
            try {
                System.out.print(prompt);
                input = sc.nextInt();
                isInt = true;
            } catch (InputMismatchException e)
            {
                System.out.println("Error! Please enter a valid input.");
                sc.nextLine();
            }
        }

        return input;
    }
}

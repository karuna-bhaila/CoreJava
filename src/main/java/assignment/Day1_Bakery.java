package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day1_Bakery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] prices = {2.98f, 4.50f, 9.98f};
        String[] muffins = {"Blueberry muffin", "Chocolate chip muffin", "Banana muffin"};
        String choice = "y";
        int muffinChoice,
                numMuffin;
        int[] quantity = {0, 0, 0};
        float total = 0f;
        float[] cost = {0f, 0f, 0f};

        while(choice.equalsIgnoreCase("y"))
        {
            displayMenu(muffins, prices);
            muffinChoice = getIntWithinRange(sc, "Enter your muffin choice: ", 1, 3);
            numMuffin = getIntWithinRange(sc, ("How many " + muffins[muffinChoice - 1] + "s? "), 0, 3);
            switch (muffinChoice){
                case 1:
                {
                    quantity[0] += numMuffin;
                    cost[0] = quantity[0] * prices[0];
                    break;
                }
                case 2:
                {
                    quantity[1] += numMuffin;
                    cost[1] = quantity[1] * prices[1];
                    break;
                }
                case 3:
                {
                    quantity[2] += numMuffin;
                    cost[2] = quantity[2] * prices[2];
                    break;
                }
                default:
                    break;
            }

            sc.nextLine();
            System.out.println("Would you like to order more?(Y/N): ");
            choice = sc.nextLine();
        }

        total = cost[0] + cost[1] + cost[2];
        System.out.println("You ordered:");
        for(int i = 0; i < muffins.length; i++)
        {
            if(quantity[i] > 0)
            {
                System.out.println(quantity[i] + " " + muffins[i] + " = " + cost[i]);
            }
        }
        System.out.println("Your total is " + total);
    }

    public static void displayMenu(String[] m, float[] p)
    {
        System.out.println("Displaying menu...");
        for(int i = 0; i < m.length; i++)
            System.out.println((i + 1) + ". " + m[i] + ": " + p[i]);
    }

    public static int getInt(Scanner sc, String prompt)
    {
        int n = 0;
        boolean isInt = false;

        while (!isInt)
        {
            try
            {
                System.out.print(prompt);
                n = sc.nextInt();
                isInt = true;
            } catch (InputMismatchException e) {
                System.out.println("Error! Not a number.");
                sc.nextLine();
            }
        }
        return n;
    }

    public static int getIntWithinRange(Scanner sc, String prompt, int min, int max)
    {
        int n = 0;
        boolean isValid = false;

        while (!isValid)
        {
            n = getInt(sc, prompt);
            if ((n < min) || (n > max))
                System.out.println("Error! Select " + min + " to " + max);
            else
                isValid = true;
        }
        return n;
    }
}

package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day2_HMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds;
        String time;

        seconds = getInt(sc, "Enter time in seconds: ");
        time = getTime(seconds);
        System.out.println(time);
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

    public static String getTime(int s)
    {
        String t;
        t = (s / 3600) + " hour(s) " + ((s % 3600) / 60) + " minute(s) " + ((s % 120) % 60) + " second(s).";
        return t;
    }
}

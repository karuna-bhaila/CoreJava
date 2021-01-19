package assignment;

import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] charArr;
        String[] symbols = new String[3];
        int repetitions;
        String choice = "y";

        while (choice.equalsIgnoreCase("y"))
        {
            System.out.println("Enter 3 symbols: ");
            for (int i = 0; i < symbols.length; i++)
                symbols[i] = getSymbol(sc);

            System.out.print("How many repetitions?: ");
            repetitions = sc.nextInt();

            charArr = fillArray(symbols, repetitions);

            for (char[] row:charArr)
            {
                for(char elem:row)
                    System.out.print(elem);
                System.out.println();
            }

            sc.nextLine();
            System.out.print("Would you like to try again?(y/n): ");
            choice = sc.nextLine();
        }
    }

    public static String getSymbol(Scanner sc)
    {
        String str = "";
        boolean isSymbol = false;

        while(!isSymbol)
        {
            System.out.print("Please enter a symbol: ");
            str = sc.nextLine();
            if(str.matches("[a-zA-Z0-9]"))
                System.out.println("Not a special character!");
            else
                isSymbol = true;
        }
        return str;
    }

    public static char[][] fillArray(String[] s, int repetitions)
    {
        char[][] cArr = new char[repetitions][];
        int i = 0;
        while (i < repetitions)
        {
            cArr[i] = new char[i+1];
            for (int j = 0; j <= i; j++)
            {
                cArr[i][j] = s[i % 3].charAt(0);
            }
            i++;
        }

        return cArr;
    }
}

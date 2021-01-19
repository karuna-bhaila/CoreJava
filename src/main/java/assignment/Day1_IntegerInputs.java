package assignment;

import java.util.Scanner;

public class Day1_IntegerInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int odd = 0;
        int even = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = Day2_HMS.getInt(sc, "Enter a number: ");
        }

        for (int elem:numbers)
        {
            if (elem > 0)
                positive++;
            else if (elem == 0)
                zero++;
            else
                negative++;

            if (elem % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
    }
}

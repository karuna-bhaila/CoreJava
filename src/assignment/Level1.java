package assignment;

import java.util.Scanner;
import java.lang.Math;

public class Level1 {
    public static void main(String [] args)
    {
        //1
        System.out.println("Twinkle, twinkle, little star,");
        System.out.println("\tHow I wonder what you are!");
        System.out.println("\t\tUp above the world so high,");
        System.out.println("\t\tLike a diamond in the sky.");
        System.out.println("Twinkle, twinkle, little star,");
        System.out.println("\tHow I wonder what you are!");

        //2
        System.out.println("\nArea and perimeter of a rectangle.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.println("The area is " + (length * width));
        System.out.println("The perimeter is " + (2 * (length + width)));

        //3
        System.out.println("\nSwapping two numbers.");
        System.out.println("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        doSwap(a, b);
        System.out.println("After swapping: a = " + a + " & b = " + b);

        //4
        System.out.println("\nArea of a hexagon.");
        int hexlen = 6;
        double hexArea = (3 * Math.sqrt(3) * Math.pow(hexlen, 2)) / 2.0;
        System.out.println("The area of hexagon with length 6 is " + hexArea);

        //5
        System.out.println("\nOdd numbers from 1 to 99");
        int odd = 1;
        int count = 0;
        while (odd <= 99)
        {
            if(odd%2 == 1)
            {
                System.out.print(odd + " ");
                count++;
            }
            odd++;
        }
        System.out.println("There are " + count + " odd numbers from 1 to 99.");

        //6
        System.out.println("\nNumbers from 1 to 100 divisible by 3/5/3 & 5");
        String div3 = "",
                div5 = "",
                div35 = "";
        int div = 1;
        while(div <= 100)
        {
            if (div % 3 == 0)
                div3 += div + ", ";

            if (div % 5 == 0)
                div5 += div + ", ";

            if ((div % 3 == 0) && (div % 5 == 0))
                div35 += div + ", ";

            div++;
        }
        System.out.println("Divisible by 3:\n" + div3);
        System.out.println("Divisible by 5:\n" + div5);
        System.out.println("Divisible by 3 & 5:\n" + div35);

        //7
        System.out.println("\nCapitalize first letter of every word");
        String sentence = "the quick brown fox jumps over the lazy dog.";
        String words[] = sentence.split(" ");
        StringBuilder str = new StringBuilder();
        for (String elem:words)
        {
            str.append(Character.toUpperCase(elem.charAt(0)));
            str.append(elem.substring(1));
            str.append(" ");
        }
        System.out.println(str);

        //8
        System.out.println("\nFind whether a number is prime");
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        int i = 2;
        while (i <= (num / 2))
        {
            if (num % i == 0)
                isPrime = false;
            i++;
        }
        if (isPrime)
            System.out.println(num + " is a prime.");
        else
            System.out.println(num + " is not a prime.");


    }

    public static void doSwap(int num1, int num2)
    {
        //Java passes parameters by value
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}

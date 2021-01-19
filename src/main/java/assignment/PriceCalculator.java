package assignment;

import java.util.Scanner;
import java.text.NumberFormat;

public class PriceCalculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double itemPrice,
                discount,
                totalPrice = 0.0;
        final int TAX = 7;

        System.out.println("Enter price.");
        for (int i = 1; i <= 5; i++)
        {
            System.out.print("Item " + i + ": ");
            itemPrice = sc.nextDouble();
            totalPrice += itemPrice;
        }

        System.out.print("Enter discount amount: ");
        discount = sc.nextDouble();

        totalPrice -= discount;
        totalPrice += (totalPrice * TAX) / 100;

        NumberFormat form = NumberFormat.getNumberInstance();
        form.setMaximumFractionDigits(2);
        System.out.println("The bill is $" + form.format(totalPrice) + ".");
    }
}

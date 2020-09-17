package classwork;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[10];
        int[] duplicates = new int[5];
        int index = 0;
        boolean isDuplicate;

        for (int i = 0; i < intArr.length; i++)
        {
            System.out.print("Please enter a number: ");
            intArr[i] = sc.nextInt();
        }

        for (int i = 0; i < intArr.length; i++)
        {
            for (int j = i + 1; j < intArr.length; j++)
            {
                if (intArr[i] == intArr[j])
                {
                    isDuplicate = true;
                    for (int k = 0; k < duplicates.length; k++)
                    {
                        if (intArr[i] == duplicates[k])
                        {
                            isDuplicate = false;
                        }
                    }

                    if (isDuplicate)
                    {
                        duplicates[index] = intArr[i];
                        index++;
                    }
                }
            }
        }

        System.out.print("The duplicates are: ");
        for (int elem:duplicates)
        {
            if (elem != 0)
                System.out.print(elem + " ");
        }
    }
}

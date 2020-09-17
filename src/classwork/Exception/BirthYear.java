package classwork.Exception;

import java.util.Scanner;

public class BirthYear {
    public static void main(String[] args) throws MyOwnNumberFormatException{
        Scanner sc = new Scanner(System.in);
        int age = 0,
                birthYear;
        boolean isValid = false;

        while (!isValid){
            try{
                System.out.print("Enter age: ");
                if (!sc.hasNextInt()) {
                    throw new MyOwnNumberFormatException();
                }
                else{
                    age = sc.nextInt();
                    isValid = true;
                }
            } catch (MyOwnNumberFormatException e){
                sc.nextLine();
                //e.getMessage();
            }
        }

        birthYear = 2020 - age;
        System.out.println("You were born in " + birthYear + ".");
    }
}

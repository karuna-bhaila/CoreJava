package classwork.Arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountDriver {
    public static void main(String[] args) {
        ArrayList<Account> accountList = new ArrayList<>();
        Account tempAcc = new Account("Julie Doe", (byte)20, 10004l);

        accountList.add(new Account("John Doe", (byte)22, 10001l));
        accountList.add(new Account("Jane Doe", (byte)23, 10002l));
        accountList.add(new Account("James Doe", (byte)20, 10003l));
        accountList.add(tempAcc);

        System.out.println("Initial Run----------------------");
        System.out.println(accountList.toString());

        accountList.remove(0);
        System.out.println("Run after index remove------------");
        System.out.println(accountList.toString());

        accountList.remove(tempAcc);
        System.out.println("Run after object remove-----------");
        System.out.println(accountList.toString());
    }
}

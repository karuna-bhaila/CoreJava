package classwork.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapsWithClasses {
    public static void main(String[] args) {
        HashMap<Account, AccountHolder> hm = new HashMap<>();

        Account a1 = new Account(1000001, "Checking", 2800.53);
        Account a2 = new Account(1000002, "Savings", 3400.20);
        Account a3 = new Account(1000003, "Checking", 3001.25);

        AccountHolder ah1 = new AccountHolder("John Doe", 1000001, (byte)28);
        AccountHolder ah2 = new AccountHolder("Jane Doe", 1000002, (byte)24);
        AccountHolder ah3 = new AccountHolder("Jamie Doe", 1000003, (byte)22);

        hm.put(a1, ah1);
        hm.put(a2, ah2);
        hm.put(a3, ah3);

        System.out.println("Initial Values");
        System.out.println(hm.toString());

        System.out.println("Removing John");
        hm.remove(a1);
        System.out.println(hm.toString());

        System.out.println("\nTabular display");
        System.out.println("Account Number\t\tName\t\tAccount Type\tBalance");
        for(Map.Entry elem:hm.entrySet())
        {
            Account tempAcc = (Account)elem.getKey();
            AccountHolder tempah = (AccountHolder)elem.getValue();
            System.out.println(tempAcc.getAccountNumber() + "\t\t\t\t" + tempah.getName() + "\t" +
                    tempAcc.getAccountType() + "\t\t" + tempAcc.getBalance());
        }
    }
}

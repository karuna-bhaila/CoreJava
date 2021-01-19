package classwork.Static;

public class AccountDriver {
    public static void main(String[] args) {
        AccountStatic as1 = new AccountStatic();
        //class instance is created
        as1.getAccountInfo();
        AccountStatic.getAccountInfo();
        System.out.println(AccountStatic.name + " " + AccountStatic.balance);
    }
}

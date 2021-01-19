package classwork.Arraylists;

public class Account {
    private String name;
    private byte age;
    private long accountNumber;

    public Account(String n, byte a, long an)
    {
        name = n;
        age = a;
        accountNumber = an;
    }

    public Account()
    {
        this("", (byte)0, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString()
    {
        return ("Name: " + getName() + " Age: " + getAge() + " Account Number: " + getAccountNumber());
    }
}

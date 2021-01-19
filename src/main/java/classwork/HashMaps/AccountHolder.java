package classwork.HashMaps;

public class AccountHolder {
    private String name;
    private long accountNumber;
    private byte age;

    public AccountHolder(String name, long accountNumber, byte age) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.age = age;
    }

    public AccountHolder() {
        this("", 0, (byte)0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return (accountNumber + " " + name + " " + age);
    }
}

final class ImmutableAccount{

    private final int accountNumber;
    private final double balance;

    public ImmutableAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
public class ImmutableDemo {

    public static void main(String [] args){

        ImmutableAccount acc = new ImmutableAccount(101, 5000.0);

        System.out.println("Account Number : " + acc.getAccountNumber());
        System.out.println("Account Balance: " + acc.getBalance());
    }
}

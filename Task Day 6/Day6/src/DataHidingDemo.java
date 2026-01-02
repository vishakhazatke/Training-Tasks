class BankAccount{

    private String accountHolder;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0)
        balance = balance + amount;
    }
}
public class DataHidingDemo {

    public static void main(String [] args){

        BankAccount acc = new BankAccount();
        acc.setAccountHolder("Vishakha");
        acc.deposit(5000);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: " + acc.getBalance());
    }
}

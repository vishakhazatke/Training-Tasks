class BankAccountDemo{
    private String accountNumber;
    private double balance;

    public BankAccountDemo(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid deposit amount");
            return;
        }
        balance = balance + amount;
        System.out.println("Deposited : " + amount);
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid withdrawal amount");
            return;
        }
        if(amount > balance){
            System.out.println("Insufficient Balance");
            return;
        }
        balance = balance - amount;
        System.out.println("Withdrawn: " + amount);
    }
}

class BankService{

    public void processTransaction(BankAccountDemo account){
        account.deposit(5000);
        account.withdraw(2000);
    }
}
public class EncapsulationRealWorldDemo {
    public static void main(String[] args) {

        BankAccountDemo account = new BankAccountDemo("ACC12345", 10000);

        BankService service = new BankService();
        service.processTransaction(account);

        System.out.println("Final Balance: " + account.getBalance());
    }
}

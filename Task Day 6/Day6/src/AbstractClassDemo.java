abstract class Bankaccount{

    double balance;

    Bankaccount(double balance){
        this.balance = balance;
    }

    void showBalance(){
        System.out.println("Balance: " + balance);
    }
    abstract void accountType();
}

class SavingsAccount extends Bankaccount{

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void accountType() {
        System.out.println("Account Type: Savings Account");
    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {

        Bankaccount acc = new SavingsAccount(25000);
        acc.showBalance();
        acc.accountType();
    }
}

class BankAccount{

    private int balance = 1000;

    public synchronized void deposit(int amount){
        balance = balance + amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", Balance: " + balance);
        notify();
    }

    public synchronized void withdraw(int amount){
        while (balance < amount){
            try {
                System.out.println(Thread.currentThread().getName() + " waiting to withdraw " + amount);
                wait();
            }
            catch (Exception e){
            }
        }
        balance = balance - amount;
        System.out.println(Thread.currentThread().getName() + " withdraw " + amount + ", Balance: " + balance);
    }

    public int getBalance(){
        return balance;
    }
}
public class BankAccountTransaction {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread depositer = new Thread() {
            public void run(){
                int[] deposits = {500, 700, 300};
                for(int amount : deposits){
                    account.deposit(amount);
                    try {
                        Thread.sleep(500);
                    }catch (Exception e){

                    }
                }
            }
        };

        Thread withdrawer = new Thread(){
          public void run() {
              int[] withdrawals = {800, 1200, 400};
              for(int amount : withdrawals){
                  account.withdraw(amount);
                  try {
                      Thread.sleep(500);
                  }catch(Exception e){ }
              }
          }
        };

        depositer.setName("Depositer");
        withdrawer.setName("Withdrawer");

        depositer.start();
        withdrawer.start();
    }
}

interface PaymentStrategy{
    void pay(int amount);
}
class CreditcardPayment implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " Using Credit card");
    }
}

class UpiPayment implements PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class PaymentContext{
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }
    public void makePayment(int amount){
        strategy.pay(amount);
    }
}
public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentContext payment = new PaymentContext();

        payment.setStrategy(new CreditcardPayment());
        payment.makePayment(1000);

        payment.setStrategy(new UpiPayment());
        payment.makePayment(500);
    }
}

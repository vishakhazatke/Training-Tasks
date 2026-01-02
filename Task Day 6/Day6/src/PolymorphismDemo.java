class Payment{
    void pay(){
        System.out.println("Payment Method");
    }
}

class CreditCardPayment extends Payment{

    @Override
    void pay() {
        System.out.println("Payment done using credit card");
    }
}

class UpiPayment extends Payment{

    @Override
    void pay() {
        System.out.println("Payment done using UPI");
    }
}
public class PolymorphismDemo {
    public static void main(String[] args){
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UpiPayment();

        p1.pay();
        p2.pay();
    }
}

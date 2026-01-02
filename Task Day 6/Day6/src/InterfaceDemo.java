class UPIPayment implements Payable{

    @Override
    public void pay() {
        System.out.println("Payment Done using UPI with GST " + GST + "%");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Payable payment = new UPIPayment();
        payment.pay();
        payment.generateReceipt();

        Payable.paymentRules();
    }
}

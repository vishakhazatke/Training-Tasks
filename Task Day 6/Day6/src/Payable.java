public interface Payable {

    double GST = 18.0;

    void pay();
    default void generateReceipt(){
        System.out.println("Receipt generated");
    }
    static void paymentRules(){
        System.out.println("Follow RBI payment guidelines");
    }
}
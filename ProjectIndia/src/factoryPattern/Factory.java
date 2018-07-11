package factoryPattern;

public class Factory  {
    public static void main(String args[]) {

        PaymentFactory paymentFactory = new PaymentFactory();
        Payment p1 = paymentFactory.getType("Credit Card");
        p1.pay();
        Payment p2 = paymentFactory.getType("Debit Card");
        p2.pay();
        Payment p3 = paymentFactory.getType("Net Banking");
        p3.pay();
        Payment p4 = paymentFactory.getType("Wallet");
        p4.pay();
    }
}

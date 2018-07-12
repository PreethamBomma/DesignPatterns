package factoryPattern;
public class Wallet implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment via WALLET");
    }
}

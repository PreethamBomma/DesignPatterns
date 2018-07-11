package factoryPattern;

public class NetBanking implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment via Net Banking");
    }
}

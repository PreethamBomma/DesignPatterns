package factoryPattern;

public class COD implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment via Cash On Delivery");
    }
}

package factoryPattern;

public class CreditCard implements Payment
{
@Override
  public void pay()
  {
      System.out.println("Payment via Credit Card");
  }


}

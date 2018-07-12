package factoryPattern;

public class DebitCard implements Payment {
@Override
  public void pay()
   {
       System.out.println("Payment via DebitCard");
   }


}

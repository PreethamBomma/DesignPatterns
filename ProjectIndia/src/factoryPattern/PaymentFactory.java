package factoryPattern;

    public class PaymentFactory  {
        //use getShape method to get object of type shape
        public Payment getType(String paymentType){
            if(paymentType == null){
                return null;
            }
            if(paymentType.equalsIgnoreCase("Credit Card")){
                return new CreditCard();

            } else if(paymentType.equalsIgnoreCase("Debit Card")){
                return new DebitCard();

            } else if(paymentType.equalsIgnoreCase("Wallet")){
                return new Wallet();
            }
            else if(paymentType.equalsIgnoreCase("Net Banking")){
                return new NetBanking();
            }

            return null;
        }

    }



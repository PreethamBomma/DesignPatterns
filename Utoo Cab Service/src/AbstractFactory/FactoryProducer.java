package AbstractFactory;

public class FactoryProducer {
    public static AbsFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("Cab")){
            return new CabFactory();

        }else if(choice.equalsIgnoreCase("City")){
            return new CityFactory();
        }

        return null;
    }
}

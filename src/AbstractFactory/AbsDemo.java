package AbstractFactory;

public class AbsDemo {
    public static void main(String[] args)
    {
        AbsFactory cabFactory = FactoryProducer.getFactory("Cab");


        Cab micro = cabFactory.getCab("Micro");
        micro.price();
        Cab mini = cabFactory.getCab("Mini");
        mini.price();
        Cab sedan = cabFactory.getCab("Sedan");
        sedan.price();
        Cab suv = cabFactory.getCab("SUV");
        suv.price();

        //get an object of Shape Rectangle

        //get color factory
        AbsFactory cityFactory = FactoryProducer.getFactory("City");
        City hyd = cityFactory.getCity("Hyderabad");
        hyd.city();
        micro.price();
        mini.price();
        suv.price();
        City bnglr = cityFactory.getCity("Bengaluru");
        bnglr.city();
        micro.price();
        mini.price();
        suv.price();
        sedan.price();
        City chennai = cityFactory.getCity("Chennai");
        chennai.city();
        micro.price();
        mini.price();
        sedan.price();








    }
}

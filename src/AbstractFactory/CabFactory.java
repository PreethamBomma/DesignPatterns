package AbstractFactory;

public class CabFactory extends AbsFactory {
    public Cab getCab(String cabType) {
        if (cabType == null)
            return null;

        if (cabType.equalsIgnoreCase("Micro"))
            return new Micro();
        else if (cabType.equalsIgnoreCase("Mini"))
            return new Mini();
        else if (cabType.equalsIgnoreCase("SUV"))
            return new SUV();
        else if (cabType.equalsIgnoreCase("Sedan"))
            return new Sedan();
        else return null;
    }
    City getCity(String cityType)
    {
return null;
    }
}

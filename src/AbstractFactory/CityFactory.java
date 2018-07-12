package AbstractFactory;

public class CityFactory extends AbsFactory {

    @Override
    Cab getCab(String cab) {
        return null;
    }
    public City getCity(String city) {
        if (city == null)
            return null;

        if (city.equalsIgnoreCase("Hyderabad"))
            return new Hyd();
        else if (city.equalsIgnoreCase("Chennai"))
            return new Chennai();
        else if (city.equalsIgnoreCase("Bengaluru"))
            return new Bengaluru();
        else return null;
    }
    }

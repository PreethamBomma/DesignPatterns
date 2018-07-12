package AbstractFactory;

public class Sedan implements Cab {

    @Override
    public void price() {
        System.out.println("Sedan Rs.25/- per km");
    }
}

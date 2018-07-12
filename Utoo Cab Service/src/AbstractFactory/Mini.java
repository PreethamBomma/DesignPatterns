package AbstractFactory;

public class Mini implements Cab {

    @Override
    public void price() {
        System.out.println("Mini Rs.20/- per km");
    }
}
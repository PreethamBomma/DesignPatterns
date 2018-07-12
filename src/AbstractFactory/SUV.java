package AbstractFactory;

public class SUV implements Cab {

    @Override
    public void price() {
        System.out.println("SUV Rs.35/- per km");
    }
}

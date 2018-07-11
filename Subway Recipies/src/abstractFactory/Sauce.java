package abstractFactory;

public class Sauce implements Item {
    @Override
    public String name() {
        return "Sauce";
    }

    @Override
    public float price() {
        return 90;
    }
}
